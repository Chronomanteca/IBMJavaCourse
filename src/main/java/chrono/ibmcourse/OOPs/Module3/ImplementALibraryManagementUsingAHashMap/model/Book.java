package chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.model;

import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.exceptions.BookTextValidationException;
import chrono.ibmcourse.OOPs.Module3.ImplementALibraryManagementUsingAHashMap.exceptions.BookYearValidationException;

public class Book {
    private String title, author, genre, ISBN;
    private int publicationYear;

    public Book(String ISBN, String title, String author, String genre, int publicationYear) throws  BookTextValidationException{
        if(isValidText(ISBN)){
            this.ISBN = ISBN;
        }
        if(isValidText(title)){
            this.title = title;
        }
        if(isValidText(author)){
            this.author = author;
        }
        if(isValidText(genre)){
            this.genre = genre;
        }
        if(isValidYear(publicationYear)){
            this.publicationYear = publicationYear;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }


    public String getGenre() {
        return this.genre;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return "ISBN: "+this.ISBN+"\nBook title: "+this.title+"\nBook Author: "+this.author+"\nBook Genre: "+this.genre+"\nBook Publication Year: "+this.publicationYear;
    }

    private boolean isValidText(String text) {
        try {
            if (text.isEmpty()) {
                throw new BookTextValidationException("Text cannot be empty!");
            }
            if (text.isBlank()) {
                throw new BookTextValidationException("Text only contains white spaces!");
            }
            if (text == null) {
                throw new BookTextValidationException("No text entered!");
            }
            return true;
        } catch (BookTextValidationException e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean isValidYear(int year)  {

        try {
            if (year < 0) {
                throw new BookYearValidationException("Year cannot be negative!");
            }
            if (year < 1000 || year > 2026) {
                throw new BookYearValidationException("Publication year can only be within the year 1000 and 2026!");
            }
            return true;
        } catch (BookYearValidationException e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
            return false;
        }


    }

}
