package org.example.LabSolutions.Module2.CreateYourFirstClass;

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
            System.out.println("Enter book title");
            String title = this.scanner.nextLine();
            System.out.println("Enter book author");
            String author = this.scanner.nextLine();
            System.out.println("Enter book cost");
            try{
                float price = Float.parseFloat(this.scanner.nextLine());
                booksList[addedBookCount++] = new Book(title,author,price);
            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number");
            } catch (NullPointerException e) {
                System.out.println();
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

    public void menu(){
        //Scanner scanner = new Scanner(System.in);
        int userInput;
        while(true){
            try {
                System.out.println("Press 1 to view Books \nPress 2 to Add book \nPress 3 to compare books\n Press any other key to exit");
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
