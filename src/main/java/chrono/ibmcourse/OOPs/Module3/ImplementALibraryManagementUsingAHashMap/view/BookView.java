package chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.view;

import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.controller.BookController;
import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.exceptions.MenuInvalidOptionException;
import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.model.Book;

import java.awt.*;
import java.util.Scanner;

public class BookView {

    private static BookView instance;
    BookController controller;
    private BookView(){
        controller = BookController.getInstance();
    }

    public static BookView getInstance(){
        if (instance == null){
            instance = new BookView();
        }
        return instance;
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Select an option from the menu:");
                System.out.println("1 - Add a Book \n2 - View all books \n3 - Search book \n4 - Remove a book \n5 - View sorted library \n6 - Exit ");
                int menuOption = Integer.parseInt(scanner.nextLine());
                switch(menuOption){
                    case 1: // add book
                        System.out.println("Enter book ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.println("Enter book Title: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter book Author: ");
                        String author = scanner.nextLine();
                        System.out.println("Enter book Genre: ");
                        String genre = scanner.nextLine();
                        System.out.println("Enter book Publication year: ");
                        int publicationYear = Integer.parseInt(scanner.nextLine());
                        controller.addBook(new Book(isbn,title,author,genre,publicationYear));
                        System.out.println("Book added to library");
                        break;
                    case 2: // view books
                        if(!(controller.librarySize()>0)){
                            System.out.println("Library is empty, try adding a book");
                        }
                        else{
                            controller.viewBooks();
                        }
                        break;
                    case 3: // search book
                        System.out.println("Enter search option");
                        System.out.println("1 - Search by ISBN \n2 - Search by Title \3 - Search by Author\n");
                        int searchOption = Integer.parseInt(scanner.nextLine());
                        if(searchOption < 0 || searchOption > 3)
                            throw new MenuInvalidOptionException("Invalid search option selected, please enter an option from the menu");
                        System.out.println("Enter search term");
                        String searchArgument = scanner.nextLine();
                        controller.searchLibrary(searchOption,searchArgument);
                        break;
                    case 4: // remove book
                        System.out.println("Enter ISBN to remove");
                        System.out.println("Book "+ ((controller.removeBook(scanner.nextLine())) ? " was removed " : "was not found on library"));
                        break;
                    case 5: // view sorted books
                        System.out.println("Enter sorting option");
                        System.out.println("1 - Sort by Title \n2 - Sort by Author\n");
                        int sortingOption = Integer.parseInt(scanner.nextLine());
                        controller.viewSortedBooks(sortingOption);
                        break;
                    case 6: // exit
                        System.out.println("GoodBye");
                        return;
                    default:

                }
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a valid number");

            }
            catch (MenuInvalidOptionException e){
                System.out.println(e.getMessage());

            }
            catch (NullPointerException e){
                System.out.println("Please avoid null values");

            }
        }
    }



}
