/*

Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.

*/


package main.java.LinkedList;
public class TextEditor {
    // Node stores one state of the text
    static class Node {
        String text;
        Node prev;
        Node next;
        Node(String text) {
            this.text = text;
        }
    }
    // Current points to the current state of the text
    Node current;
    // Add a new state to the history
    void addState(String text) {
        Node newNode = new Node(text);
        // If this is the first state
        if (current == null) {
            current = newNode;
            return;
        }
        // Remove redo history when a new action is performed
        current.next = null;
        // Connect new node with current node
        newNode.prev = current;
        current.next = newNode;
        // New node becomes the current state
        current = newNode;
    }
    // Undo the last action
    void undo() {
        // Move to previous state if available
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed");
        } else {
            System.out.println("Nothing to undo");
        }
    }
    // Redo the previously undone action
    void redo() {
        // Move to next state if available
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed");
        } else {
            System.out.println("Nothing to redo");
        }
    }
    // Display the current text
    void currentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available");
        }
    }
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        // Add different text states
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        // Display latest state
        editor.currentState();
        // Undo last change
        editor.undo();
        editor.currentState();
        // Undo again
        editor.undo();
        editor.currentState();
        // Redo the undone change
        editor.redo();
        editor.currentState();
        // Add a new state
        // This clears the old redo history
        editor.addState("Hello Java");
        editor.currentState();
        // Redo is not possible because a new state was added
        editor.redo();
    }
}

