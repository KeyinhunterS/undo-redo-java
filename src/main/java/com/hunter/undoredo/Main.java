package com.hunter.undoredo;

public class Main {
    public static void main(String[] args) {
        UndoRedoManager<String> manager = new UndoRedoManager<>();

        manager.addState("State 1");
        manager.addState("State 2");
        manager.addState("State 3");

        System.out.println("Current: " + manager.getCurrentState());
        manager.undo();
        System.out.println("Undo: " + manager.getCurrentState());
        manager.undo();
        System.out.println("Undo: " + manager.getCurrentState());
        manager.redo();
        System.out.println("Redo: " + manager.getCurrentState());
        manager.addState("State 4");
        System.out.println("Current: " + manager.getCurrentState());
        manager.redo(); // Should print: Nothing to redo.
    }
}
