
/*
Program 18: Memento Design Pattern

Purpose:
Memento Pattern saves an object's state so it can be restored later.
This example implements a simple save and restore operation.
*/

// Memento stores a snapshot of the text
class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    // Provide the saved state to the originator
    public String getState() {
        return state;
    }
}

// Originator creates and restores its state
class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("Current text: " + text);
    }

    // Save the current state in a Memento object
    public Memento save() {
        return new Memento(text);
    }

    // Restore the previously saved state
    public void restore(Memento memento) {
        text = memento.getState();
    }
}

public class MementoPattern {
    public static void main(String[] args) {
        // Create the editor and enter the original text
        TextEditor editor = new TextEditor();
        editor.setText("Hello World");
        editor.display();

        // Save a snapshot of the current text
        Memento savedState = editor.save();

        // Modify the text after saving
        editor.setText("New Text");
        editor.display();

        // Restore the saved text
        editor.restore(savedState);
        editor.display();
    }
}
