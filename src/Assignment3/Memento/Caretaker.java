package Assignment3.Memento;

class Caretaker {
    private TextMemento memento;

    public void save(TextEditor editor) {
        memento = editor.save();
    }

    public void restore(TextEditor editor) {
        editor.restore(memento);
    }
}

