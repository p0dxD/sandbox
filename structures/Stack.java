package structures;

import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> items;
    public Stack() {
        items = new ArrayList<>();
    }

    public void push (T item) {
        if (item == null) {
            return;
        }
        items.add(item);
    }

    public int getSize() {
        return this.items.size();
    }

    public T pop() {
        return items.size() > 0 ? items.remove(items.size()-1) : null;
    }

    public T peek () {
        return items.size() > 0 ? items.get(items.size()-1) : null;
    } 
}