package doublylinkedlist.librarymanagementsystem;

class Library {
    private Book head, tail;
    private int count;

    // Add book at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        count++;
    }

    // Add book at the end
    public void addAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        count++;
    }

    // Remove book by ID
    public void removeBook(int bookID) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp == null) return;

        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;

        count--;
    }

    // Search book by Title
    public Book searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search book by Author
    public Book searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Update Availability Status by Book ID
    public void updateAvailability(int bookID, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display books in forward order
    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.bookID + ", Title: " + temp.title + ", Author: " + temp.author +
                    ", Genre: " + temp.genre + ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display books in reverse order
    public void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("ID: " + temp.bookID + ", Title: " + temp.title + ", Author: " + temp.author +
                    ", Genre: " + temp.genre + ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count total books
    public int getTotalBooks() {
        return count;
    }
}

