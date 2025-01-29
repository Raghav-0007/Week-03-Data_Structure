package doublylinkedlist.redofunctionalityfortexteditor;

class TextEditor {
    private Node currentState;  // Points to the current state
    private int historySize;    // To keep track of the number of nodes in history
    private final int MAX_HISTORY = 10;  // Maximum history size (undo/redo limit)

    public TextEditor() {
        this.currentState = null;
        this.historySize = 0;
    }

    // Add a new text state to the history
    public void addState(String text) {
        Node newState = new Node(text);

        // If history exceeds the maximum size, remove the oldest state
        if (historySize == MAX_HISTORY) {
            currentState = currentState.prev;  // Move current to previous state
            currentState.next = null;          // Remove the link to the next state
            historySize--;
        }

        if (currentState != null) {
            newState.prev = currentState;  // Link the new state to the current state
            currentState.next = newState;
        }
        currentState = newState;  // Set the current state to the new state
        historySize++;
    }

    // Undo functionality (revert to the previous state)
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;  // Move to the previous state
            System.out.println("Undo: " + currentState.textContent);
        } else {
            System.out.println("No more undo history.");
        }
    }

    // Redo functionality (revert to the next state)
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;  // Move to the next state
            System.out.println("Redo: " + currentState.textContent);
        } else {
            System.out.println("No more redo history.");
        }
    }

    // Display the current text state
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current State: " + currentState.textContent);
        } else {
            System.out.println("No text content.");
        }
    }
}

