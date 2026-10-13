package model.Library;

public class DVD extends LibraryItem {
    private String director;
    private String format;

    public DVD(String title, int year, String director, String format) {
        super(title, year);
        this.director = director;
        this.format = format;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
