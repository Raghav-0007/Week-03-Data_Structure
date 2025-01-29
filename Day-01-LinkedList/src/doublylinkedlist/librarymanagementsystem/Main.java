package doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addAtBeginning("Harry Potter", "J.K. Rowling", "Fantasy", 101, true);
        library.addAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 102, true);
        library.addAtEnd("1984", "George Orwell", "Dystopian", 103, false);
        library.addAtBeginning("To Kill a Mockingbird", "Harper Lee", "Fiction", 104, true);

        // Display books (Forward)
        System.out.println("Library Books (Forward):");
        library.displayForward();

        // Remove a book
        library.removeBook(102);
        System.out.println("\nAfter Removing 'The Hobbit':");
        library.displayForward();

        // Search by Title
        System.out.println("\nSearching for '1984':");
        Book foundBook = library.searchByTitle("1984");
        if (foundBook != null) System.out.println("Found: " + foundBook.title + " by " + foundBook.author);

        // Update Availability
        library.updateAvailability(103, true);
        System.out.println("\nAfter Updating Availability of '1984':");
        library.displayForward();

        // Display books (Reverse)
        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();

        // Total number of books
        System.out.println("\nTotal Books in Library: " + library.getTotalBooks());
    }
}

