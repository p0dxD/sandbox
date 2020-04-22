package structures;

//linkedlist class
public class LinkedListItems<T> {
    Item<T> items;
    int size = 0;
    
    public LinkedListItems() {
    }
    
    public LinkedListItems(T item) {
        addItem(item);
    }
    
    public void addItem(T item) {
        if (item == null) {
            return;
        }
        
        Item<T> tmp = new Item<>(item);
        
        if (items == null) {
            items = tmp;
            size++;
        } else {
            Item<T> crs = items;
            while (crs.nextItem != null) {
                crs = crs.nextItem;
            }
            crs.nextItem = tmp;
            size++;
            
        }
        
    }
    
    public void removeItem(T item) {
        if (item == null) {
            return;
        } else if (items.getItem().equals(item)) {
            items = items.nextItem;
            size--;
        } else {
            Item<T> prev = items;
            Item<T> crs = items;
            while(crs != null) {
                if (crs.getItem().equals(item)) {
                    prev.nextItem = crs.nextItem;
                    size--;
                }
                prev = crs;
                crs = crs.nextItem;
            }
        }
    }
    

    public int getSize() {
        return this.size;
    }
    
    public T getHead() {
        return this.items != null? items.getItem(): null;
    }

    public void removeItem(Item<T> item) {
        if (item == null) {
            return;
        } else if (items.equals(item)) {
            items = items.nextItem;
            size--;
        } else {
            Item<T> prev = items;
            Item<T> crs = items;
            while(crs != null) {
                if (crs.equals(item)) {
                    prev.nextItem = crs.nextItem;
                    size--;
                }
                prev = crs;
                crs = crs.nextItem;
            }
        }  
    }
    
    public void printItems() {
        Item<T> tmp  = 
        items;
        while (tmp != null) {
            System.out.print(tmp.getItem() +" ");
            tmp = tmp.nextItem;
        }
        System.out.println();
    }
    
    public Item<T> getItems() {
        return this.items;
    }
}