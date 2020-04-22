package structures;

public class Queue<T> {
    LinkedListItems<T> items;
    public Queue() {
        this.items = new LinkedListItems<>();
    }

    public void add(T item) {
        items.addItem(item);
    }

    public T poll() {
        T tmp = items.getHead();
        items.removeItem(tmp);
        return tmp;
    }

    public T peek() {
        return items.getHead();
    }

    public int size() {
        return items.getSize();
    }
}