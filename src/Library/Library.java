package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public List<String> getBooks() {
        return books;
    }
    public String searchBook(String book) {
        if (books.contains(book)) {
            return "Book found: " + book;
        } else {
            return "Book not found";
        }
    }
    private List<String> issuedBooks = new ArrayList<>();

    public String issueBook(String book) {
        if (books.contains(book) && !issuedBooks.contains(book)) {
            issuedBooks.add(book);
            books.remove(book);
            return "Book issued: " + book;
        } else {
            return "Book not available for issuance.";
        }
    }


}