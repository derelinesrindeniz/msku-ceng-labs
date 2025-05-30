package generics.stack;

public class StackItem<T> {

    private T item;

    StackItem<T> next;

    public StackItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public StackItem<T> getNext() {
        return next;
    }

    public void setNext(StackItem<T> next) {
        this.next = next;
    }
}