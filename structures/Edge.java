package structures;

public class Edge<T> extends Tuple<Vertex<T>,Vertex<T>> {
    int weight;

    public Edge(Vertex<T> t, Vertex<T> g, int weight) {
        super(t, g);
        this.weight = weight;
    }

}