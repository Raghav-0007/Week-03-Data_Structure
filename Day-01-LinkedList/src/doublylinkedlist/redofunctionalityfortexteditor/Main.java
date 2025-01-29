package doublylinkedlist.redofunctionalityfortexteditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Adding some initial text states
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");
        editor.addState("Hello World!!!");

        // Displaying current state after typing some text
        editor.displayCurrentState();

        // Performing undo operations
        editor.undo();   // Should undo to "Hello World!!"
        editor.undo();   // Should undo to "Hello World!"

        // Performing redo operations
        editor.redo();   // Should redo to "Hello World!!"
        editor.redo();   // Should redo to "Hello World!!!"

        // Displaying current state
        editor.displayCurrentState();

        // Adding new text to test the fixed size history
        editor.addState("Hello Universe!");
        editor.addState("Hello Universe!!");
        editor.addState("Hello Universe!!!");
        editor.addState("Hello Universe!!!!");
        editor.addState("Hello Universe!!!!!");

        // Display current state after adding more states
        editor.displayCurrentState();

        // Testing undo after the fixed size
        editor.undo();  // Undo the latest
        editor.undo();  // Undo to previous state
        editor.undo();  // Undo to previous state
    }
}

