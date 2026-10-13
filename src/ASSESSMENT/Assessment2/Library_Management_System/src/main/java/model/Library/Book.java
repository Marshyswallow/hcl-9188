package model.Library;

public class Book extends LibraryItem {
    private String author;
    private String publisher;

    public Book(String title, int year, String author, String publisher) {
        super(title, year);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
