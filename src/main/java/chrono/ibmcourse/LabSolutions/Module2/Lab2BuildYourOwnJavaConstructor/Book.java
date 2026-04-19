package chrono.ibmcourse.LabSolutions.Module2.Lab2BuildYourOwnJavaConstructor;

public class Book implements Cloneable{
    private String title;
    private String author;
    private float price;

    @Override
    public boolean equals(Object obj) {
        Book comparisonBook = (Book)obj;
        if(this.title == comparisonBook.getTitle() && this.author == comparisonBook.getAuthor() && this.price == comparisonBook.getPrice())
            return true;
        return false;
    }

    public Book() {
        this.title = null;
        this.author = null;
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title - "+this.title+"\nAuthor -"+this.author+"\nPrice"+String.format("%.2f",this.price);
    }
}
