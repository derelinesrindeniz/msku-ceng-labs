package generics.stack;

import java.util.List;

public interface Stack<T> {

    void push(T item);

    T pop ();

    boolean empty();

    List<T> toList();
}