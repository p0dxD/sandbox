package structures;

public class Vertex<T> {
    T vertex;
    boolean visited;
    public Vertex(T vertex) {
        this.vertex = vertex;
    }
    public T getVertexValue() {
        return this.vertex;
    } 
    public void isVisited(boolean visited) {
        this.visited = visited;
    }
    public boolean isVisited() {
        return this.visited;
    }
}
