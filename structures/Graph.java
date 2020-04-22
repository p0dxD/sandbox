package structures;
import java.util.HashMap;
import java.util.ArrayList;

public class Graph<T> {
    HashMap<T, LinkedListItems<Edge<T>>> graph;
    ArrayList<T> vertices;
    ArrayList<Tuple<Edge<T>,Edge<T>>> edges;

    public Graph(ArrayList<T> vertices, ArrayList<Tuple<Edge<T>,Edge<T>>> edges) {
        System.out.println("Initializing graph");
        graph = new HashMap<>(); 
        this.vertices = vertices;
        this.edges = edges;
    }

    @SuppressWarnings (value="unchecked")
    public void initialize() {
        for (Tuple<Edge<T>,Edge<T>> edgePair: edges) {
            Edge<T> first = (Edge<T>)edgePair.getValues()[0];
            Edge<T> second = (Edge<T>)edgePair.getValues()[1];
            if(graph.containsKey(first.getEdgeValue())) {
                graph.get(first.getEdgeValue()).addItem(second);
            } else {
                graph.put(first.getEdgeValue(), new LinkedListItems<Edge<T>>(second));
            }
        }
    }
    
    public void printGraph() {
        System.out.println("Printing graph contents");
        for (T vertex: vertices) {
             System.out.println("Vertex object: " + vertex);
            Item<Edge<T>> items = graph.get(vertex).getItems();
            while(items != null) {
                System.out.print(items.getItem().getEdgeValue()+ " ");
                items = items.nextItem;
            }
            
            System.out.println();
            
        }
    }
    
}