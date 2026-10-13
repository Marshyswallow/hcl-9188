package model.Library;

import java.time.Year;

public abstract class LibraryItem implements Borrowable {
    private static int nextId = 1001;
    private final int id;
    private String title;
    private int year;

    public LibraryItem(String title, int year) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be blank");
        }
        int currentYear = Year.now().getValue();
        if (year < 1900 || year > currentYear) {
            throw new IllegalArgumentException("Year must be between 1900 and " + currentYear);
        }
        this.id = nextId++;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be blank");
        }
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if (year < 1900 || year > currentYear) {
            throw new IllegalArgumentException("Year must be between 1900 and " + currentYear);
        }
        this.year = year;
    }
}
