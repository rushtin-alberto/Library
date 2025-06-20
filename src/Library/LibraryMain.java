package Library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        library.addBook("1984");
        library.issueBook("1984");
        library.viewCatalog();
    }
}

