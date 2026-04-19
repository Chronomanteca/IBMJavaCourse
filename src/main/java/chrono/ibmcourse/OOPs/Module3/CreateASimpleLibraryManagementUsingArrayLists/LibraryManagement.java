package chrono.ibmcourse.OOPs.Module3.CreateASimpleLibraryManagementUsingArrayLists;
import java.util.*;

// LibraryManagement class to manage the book collection
public class LibraryManagement {

    public static void sortLibrary(List<Book> library, int comparatorID, boolean ascending){
        Comparator<Book> comparator;
        boolean isSorted = true;
        switch (comparatorID){
            case 1: //title
                comparator = Comparator.comparing(Book::getBookTitle, String.CASE_INSENSITIVE_ORDER);
                if(ascending){
                    library.sort(comparator);
                }
                else {
                    library.sort(Collections.reverseOrder(comparator));
                }

                break;
            case 2: //author\
                comparator = Comparator.comparing(Book::getAuthor, String.CASE_INSENSITIVE_ORDER);
                if(ascending){
                    library.sort(comparator);
                }
                else {
                    library.sort(Collections.reverseOrder(comparator));
                }
                break;
            case 3: //publication year
                comparator = Comparator.comparing(Book::getPublicationYear);
                if(ascending){
                    library.sort(comparator);
                }
                else {
                    library.sort(Collections.reverseOrder(comparator));
                }
                break;
            case 4: //availability
                comparator = Comparator.comparing(Book::isAvailable);
                if(ascending){
                    library.sort(comparator);
                }
                else {
                    library.sort(Collections.reverseOrder(comparator));
                }
                break;
            default:
                isSorted = false;
                System.out.println("Invalid option selected");
        }
        if(isSorted)
            printLibrary(library);
    }

    public static void printLibrary(List<Book> library){
        if(library.isEmpty()){
            System.out.println("Library empty, try adding a book");
        }
        else{
            for(Book b : library){
                System.out.println(b.toString());
                System.out.println();
            }
        }

    }


    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Step 2: Create an ArrayList to store Book objects
        // Hint: Use ArrayList<Book>
        List<Book> library = new ArrayList<>();
        
        // Step 3: Implement a menu-driven program with the following options:
        // 1. Add a book
        // 2. View all books
        // 3. Search for a book by title
        // 4. Check out a book
        // 5. Return a book
        // 6. Sort books (by title, author, or publication year)
        // 7. View available books only
        // 8. Exit

        while(true){
            try{
                System.out.println("Select an option from the menu:");
                System.out.println("1 - Add a Book \n2 - View all Books \n3 - Search book by title \n4 - Check out book \n5 - Return Book \n6 - Sort books \n7 - View available books \n8 - Close menu");
                int selectedMenuOption = Integer.parseInt(scanner.nextLine());
                if(selectedMenuOption <0){
                    throw new NumberFormatException();
                }
                else{
                    switch (selectedMenuOption){
                        case 1:
                            System.out.println("Enter book title");
                            String title = scanner.nextLine();
                            System.out.println("Enter book author");
                            String author = scanner.nextLine();
                            System.out.println("Enter book year");
                            int year = Integer.parseInt(scanner.nextLine());
                            library.add(new Book(title,author,year));
                            System.out.println("Book has been added!");
                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;
                        case 2:
                            printLibrary(library);


                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;
                        case 3:
                            Comparator<Book> byTitle = Comparator.comparing(Book::getBookTitle, String.CASE_INSENSITIVE_ORDER);
                            library.sort(byTitle);
                            System.out.println("Enter title to search");
                            String searchTitle = scanner.nextLine();
                            Book searchPlaceholder = new Book(searchTitle,"searchAuthor",1900);

                            int searchIndex = Collections.binarySearch(library,searchPlaceholder,byTitle);
                            if(searchIndex >= 0){
                                System.out.println("Book found, displaying book info:");
                                System.out.println(library.get(searchIndex).toString());
                            }
                            else{
                                System.out.println("Book not found");
                            }
                            Collections.shuffle(library);
                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;
                        case 4:
                            System.out.println("Enter book index");
                            int checkoutIndex = Integer.parseInt(scanner.nextLine());
                            if(checkoutIndex >= 0 && checkoutIndex < library.size()){
                                if(library.get(checkoutIndex).checkOut()){
                                    System.out.println("You have checked out the following book: \n"+library.get(checkoutIndex).toString());
                                }
                                else {
                                    System.out.println("Book is not available to checkout");
                                }
                            }
                            else{
                                System.out.println("Index not valid, maximum index allowed is "+(library.size()-1));
                            }

                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            break;
                        case 5:
                            System.out.println("Enter book index");
                            int returnIndex = Integer.parseInt(scanner.nextLine());
                            if(returnIndex >= 0 && returnIndex < library.size()){
                                if(library.get(returnIndex).returnBook()){
                                    System.out.println("You have returned the following book: \n"+library.get(returnIndex).toString());
                                }
                                else {
                                    System.out.println("Book has already been returned");
                                }
                            }
                            else{
                                System.out.println("Index not valid, maximum index allowed is "+(library.size()-1));
                            }

                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;
                        case 6:
                            System.out.println("Enter a sorting option: \n1 - Sort by Name \n2 - Sort by Author \n3 - Sort by Publication Year \n4 - Sort by status");
                            int sortOption = Integer.parseInt(scanner.nextLine());
                            System.out.println("Press 1 for descending, 2 for ascending");
                            int ascendingOption = Integer.parseInt(scanner.nextLine());
                            boolean ascending = true;
                            if(ascendingOption == 1){
                                ascending = false;
                            }
                            sortLibrary(library,sortOption,ascending);

                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;
                        case 7:
                            List<Book> filteredLibrary = library.stream().filter(Book::isAvailable).toList();
                            System.out.println("Printing available books");
                            printLibrary(filteredLibrary);
                            System.out.println("Press a key to continue...");
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;
                        case 8:
                            System.out.println("Goodbye");
                            return;
                        default:
                            throw new NumberFormatException();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }

        }

    }

}
