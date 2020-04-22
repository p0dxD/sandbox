package structures;

public class Edge<T> {
    T edge;
    int weight;
    boolean visited;
    public Edge(T edge, int weight) {
        this.edge = edge;
        this.weight = weight;
    }
    public T getEdgeValue() {
        return this.edge;
    } 
    public int getWeight() {
        return this.weight;
    }
    public boolean isVisited() {
        return this.visited;
    }
}
