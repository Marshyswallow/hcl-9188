package model.Library;

public interface Borrowable {
    boolean isAvailable();
    void Borrow();
    void giveBack();
}
