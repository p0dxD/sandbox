package structures;

public class Item<T> {
    T item = null;
    Item<T> nextItem;
    
    public Item(final T item) {
        this.item = item;
    }
    
    public T getItem() {
        return this.item;
    }
}