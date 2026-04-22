package chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.controller;

import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.exceptions.MenuInvalidOptionException;
import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.model.Book;

import java.util.*;

public class BookController {

    private HashMap<String,Book> library;

    private static BookController instance;

    private BookController(){
        this.library = new HashMap<>();
    }

    public static BookController getInstance() {
        if(instance == null){
            instance = new BookController();
        }
        return instance;
    }

    public int librarySize(){
        return this.library.size();
    }

    public void addBook(Book book){
        this.library.put(book.getISBN(),book);
    }

    public void viewBooks(){
        for(Book b : library.values()){
            System.out.println(b.toString());
        }
    }

    public void searchLibrary ( int filterOption, String searchArgument){

        List<Book> searchResults = new ArrayList<>();
        for(Map.Entry<String, Book> entry : library.entrySet()){

            if(filterOption == 1){ //by ISBN
                if(library.containsKey(searchArgument)){
                    searchResults.add(library.get(searchArgument));
                }
            }

            else if(filterOption == 2){ //by title
                if(entry.getValue().getTitle().contains(searchArgument)){
                    searchResults.add(entry.getValue());
                }
            }
            else if(filterOption == 3){// by author
                if(entry.getValue().getAuthor().contains(searchArgument)){
                    searchResults.add(entry.getValue());
                }

            }
            else{
                System.out.println("Please select a valid search option");
            }


        }

        if(!searchResults.isEmpty()){
            System.out.println("Displaying search results: ");
            for(Book book : searchResults){
                System.out.println(book.toString());
            }
        }
        else{
            System.out.println("No books found");
        }

    }


    public boolean removeBook(String ISBN){

        if(library.containsKey(ISBN)){
            library.remove(ISBN);;
            return true;

        }
        return false;
    }

    public void viewSortedBooks(int sortingOption){
        TreeMap<String,Book> libraryTreeMap = switch (sortingOption) {
            case 1 ->
                    new TreeMap<>(Comparator.comparing(isbn -> library.get(isbn).getTitle(), String.CASE_INSENSITIVE_ORDER));
            case 2 ->
                    new TreeMap<>(Comparator.comparing(isbn -> library.get(isbn).getAuthor(), String.CASE_INSENSITIVE_ORDER));
            default -> throw new MenuInvalidOptionException("Enter a valid filter option");
        };
        libraryTreeMap.putAll(library);
        System.out.println("Displaying filtered library");
        for(String key : libraryTreeMap.keySet()){
            System.out.println(key);
            System.out.println(libraryTreeMap.get(key).toString());
        }
    }
}
