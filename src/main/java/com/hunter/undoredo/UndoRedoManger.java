package com.hunter.undoredo;

public class UndoRedoManger <T> {
    private Node<T> current;

    public void addState(T state) {
        Node<T> newNode = new Node<>(state);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
    }

    public T undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.data;
        } else {
            System.out.println("Nothing to undo.");
            return null;
        }
    }

    public T redo() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.data;
        } else {
            System.out.println("Nothing to redo.");
            return null;
        }
    }

    public T getCurrentState() {
        return current != null ? current.data : null;
    }
}
