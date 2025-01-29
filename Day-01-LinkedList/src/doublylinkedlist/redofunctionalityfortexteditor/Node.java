package doublylinkedlist.redofunctionalityfortexteditor;

class Node {
    String textContent;   // Holds the text content of the document
    Node prev;            // Pointer to the previous state (undo)
    Node next;            // Pointer to the next state (redo)

    public Node(String textContent) {
        this.textContent = textContent;
        this.prev = null;
        this.next = null;
    }
}

