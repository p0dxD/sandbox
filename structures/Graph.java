package structures;
import java.util.HashMap;
import java.util.ArrayList;

public class Graph<T> {
    HashMap<Vertex<T>, LinkedListItems<Vertex<T>>> graph;
    ArrayList<Vertex<T>> vertices;
    ArrayList<Edge<T>> edges;

    public Graph(ArrayList<Vertex<T>> vertices, ArrayList<Edge<T>> edges) {
        System.out.println("Initializing graph");
        graph = new HashMap<>(); 
        this.vertices = vertices;
        this.edges = edges;
    }

    @SuppressWarnings (value="unchecked")
    public void initialize() {
        for (Edge<T> edgePair: edges) {
            Vertex<T> first = (Vertex<T>)edgePair.getValues()[0];
            Vertex<T> second = (Vertex<T>)edgePair.getValues()[1];
            System.out.println("Here");
            if(graph.containsKey(first)) {
                graph.get(first).addItem(second);
            } else {
                graph.put(first, new LinkedListItems<Vertex<T>>(second));
            }
        }
    }
    
    public void printGraph() {
        System.out.println("Printing graph contents");
        for (Vertex<T> vertex: vertices) {
             System.out.println("Vertex object: " + vertex);
            Item<Vertex<T>> items = graph.get(vertex).getItems();
            while(items != null) {
                System.out.print(items.getItem().getVertexValue()+ " ");
                items = items.nextItem;
            }
            
            System.out.println();
            
        }
    }
    
}