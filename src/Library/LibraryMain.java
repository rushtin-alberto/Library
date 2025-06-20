package Library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        System.out.println(library.issueBook("The Great Gatsby"));
        System.out.println(library.issueBook("1984"));

    }
}

