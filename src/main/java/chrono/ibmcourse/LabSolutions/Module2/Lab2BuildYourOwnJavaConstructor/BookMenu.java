package chrono.ibmcourse.LabSolutions.Module2.Lab2BuildYourOwnJavaConstructor;

import java.util.Scanner;

public class BookMenu {

    private final int MAX_BOOK_AMOUNT = 10;
    private Book[] booksList = new Book[MAX_BOOK_AMOUNT];
    private int addedBookCount;
    private Scanner scanner = new Scanner(System.in);

    public void addBook(){

        //Check that book list has space available
        if(addedBookCount == MAX_BOOK_AMOUNT){
            System.out.println("List already has "+MAX_BOOK_AMOUNT+" books added");
        }
        else{
            //Handle new submenu option
            System.out.println("Press 1 to add new book \nPress 2 to clone an existing book");
            int submenuSelection = Integer.parseInt(scanner.nextLine());
            try {
                switch (submenuSelection) {
                    case 1:
                        System.out.println("Enter book title");
                        String title = this.scanner.nextLine();
                        System.out.println("Enter book author");
                        String author = this.scanner.nextLine();
                        System.out.println("Enter book cost");
                        float price = Float.parseFloat(this.scanner.nextLine());
                        booksList[addedBookCount++] = new Book(title, author, price);
                        break;
                    case 2:
                        //Add cloning option here
                        System.out.println("Enter the index of the item to clone");
                        int indexToClone = Integer.parseInt(scanner.nextLine());
                        booksList[addedBookCount++] = (Book)booksList[indexToClone].clone();
                        break;
                    default:
                        System.out.println("Enter valid number");
                }

            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number");
            } catch (NullPointerException e) {
                System.out.println();
            } catch(CloneNotSupportedException e){
                System.out.println("clone not supported");
            }
        }
    }

    public void viewBooks(){
        //Check that list is not empty
        if(addedBookCount == 0){
            System.out.println("No books have been added");
        }
        else{
            for(Book b : booksList){
                System.out.println(b.toString());
            }
        }
    }

    public void compareBooks(){
        try {
            System.out.println("Enter index of first book");
            int firstBookIndex = Integer.parseInt(this.scanner.nextLine());
            System.out.println("Enter index of second book");
            int secondBookIndex = Integer.parseInt(this.scanner.nextLine());
            int expensiveBookIndex = (booksList[firstBookIndex].getPrice() > booksList[secondBookIndex].getPrice()) ? firstBookIndex :secondBookIndex;
            System.out.println("Showing information of expensive book");
            System.out.println(booksList[expensiveBookIndex].toString());
        } catch (Exception e){
            System.out.println("Make sure to enter integers only please");
        }
    }

    public void changePrice(){

        try{

            System.out.println("Enter index of book to change price");
            int changePriceIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("enter new price");
            float updatedPrice = Float.parseFloat(scanner.nextLine());
            booksList[changePriceIndex].setPrice(updatedPrice);


        }catch (NumberFormatException e){
            System.out.println("Enter a valid number");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a valid index");
        }
    }

    public void bookAccess(){

        try{
            System.out.println("Enter index of comparison target book");
            int bookTargetIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter index of book used for comparison");
            int bookComparisonIndex = Integer.parseInt(scanner.nextLine());
            if (booksList[bookTargetIndex].equals(booksList[bookComparisonIndex])) {
                System.out.println("The books are the same");
            } else {
                System.out.println("the books are not the same");
            }
        }catch (NumberFormatException e){
            System.out.println("Enter a valid number");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Enter a valid index");
        }
    }

    public void menu(){
        //Scanner scanner = new Scanner(System.in);
        int userInput;
        while(true){
            try {
                System.out.println("Press 1 to view Books \nPress 2 to Add book \nPress 3 to compare books \nPress 4 to change book price \nPress 5 to check if 2 books are equal \n Press any other key to exit");
                userInput = Integer.parseInt(scanner.nextLine());

                switch (userInput){
                    case 1:
                        viewBooks();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        compareBooks();
                        break;
                    case 4:
                        changePrice();
                        break;
                    case 5:
                        bookAccess();
                        break;
                    default:
                        System.out.println("Goodbye");
                        return ;
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("GoodBye!");
                return ;
            } catch (NullPointerException e){
                System.out.println();
            }
        }
    }
}
