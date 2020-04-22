import java.util.ArrayList;
import structures.*;

class Playground {
    public static void main(String[ ] args) {
        System.out.println("Hello Java");

        Item<String> item = new Item<String>("testing item");
        System.out.println("Item: " + item.getItem());
        
        LinkedListItems<String> itemsList = new LinkedListItems<>();
        
        System.out.println("Items: " + itemsList.getItems());
        itemsList.addItem("Testing-Item");
        itemsList.addItem("Testing-Item2");
        itemsList.addItem("Testing-Item3");
        itemsList.addItem("Testing-Item4");
        itemsList.addItem("Testing-Item5");
        itemsList.printItems();
        itemsList.removeItem("Testing-Item3");
        itemsList.printItems();
        itemsList.addItem("Testing-Item");
        itemsList.printItems();
        

        ArrayList<Integer> vertices = new ArrayList<>();
        vertices.add(1);
        vertices.add(2);
        vertices.add(3);
        vertices.add(4);
        vertices.add(5);
        ArrayList<Tuple<Edge<Integer>,Edge<Integer>>> edges = new ArrayList<>();
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(1,0),new Edge<Integer>(2,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(1,0),new Edge<Integer>(5,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(2,0),new Edge<Integer>(1,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(2,0),new Edge<Integer>(5,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(2,0),new Edge<Integer>(3,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(2,0),new Edge<Integer>(4,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(3,0),new Edge<Integer>(2,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(3,0),new Edge<Integer>(4,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(4,0),new Edge<Integer>(2,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(4,0),new Edge<Integer>(5,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(4,0),new Edge<Integer>(3,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(5,0),new Edge<Integer>(4,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(5,0),new Edge<Integer>(1,0)));
        edges.add(new Tuple<Edge<Integer>,Edge<Integer>>(new Edge<Integer>(5,0),new Edge<Integer>(2,0)));
        
        Graph<Integer> graph = new Graph<>(vertices, edges);
        graph.initialize();
        graph.printGraph();
    }
}


