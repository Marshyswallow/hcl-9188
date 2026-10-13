package model.Library;

public class Magazines extends LibraryItem {
    private String publisher;
    private int issueNumber;

    public Magazines(String title, int year, String publisher, int issueNumber) {
        super(title, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
