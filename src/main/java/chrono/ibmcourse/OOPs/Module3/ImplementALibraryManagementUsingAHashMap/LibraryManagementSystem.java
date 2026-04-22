package chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap;

import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.view.BookView;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class LibraryManagementSystem {
    
    public static void main(String[] args) {
        // Step 7: Create a Scanner for user input
        
        // Step 8: Create a HashMap to store books (with ISBN as the key)
        
        // Step 9: Implement the main loop with menu options
        // Hint: Options should include adding a book, viewing all books, 
        // searching for books, removing a book, viewing sorted books, and exiting
        
        // Step 10: Implement the "Add a book" option
        // Hint: Prompt user for book details (ISBN, title, author, genre, year)
        // Validate input and add to the HashMap
        
        // Step 11: Implement the "View all books" option
        // Hint: Iterate through the HashMap and display all books
        
        // Step 12: Implement the "Search for a book" option
        // Hint: Allow searching by ISBN, title or author
        
        // Step 13: Implement the "Remove a book" option
        // Hint: Remove a book from the collection using its ISBN
        
        // Step 14: Implement the "View sorted books" option
        // Hint: Use TreeMap to sort books by title or author
        BookView menu = BookView.getInstance();
        menu.menu();
    }
}