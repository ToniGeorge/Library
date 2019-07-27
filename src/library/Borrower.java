package library;

import java.util.ArrayList;

public class Borrower extends LibraryParticipant {

    public int numOfBooks = 0;
    boolean blacklisted = false;
    public ArrayList<Book> borrowHistory = new ArrayList<Book>();

    public Borrower(String fn, String ln, String bd, String email, String cn, String un, String password) {
        super(fn, ln, bd, email, cn, un, password);
    }

    public void borrowBook(Book b) {
        if (!blacklisted) {
            borrowHistory.add(b);
        }
    }
}
