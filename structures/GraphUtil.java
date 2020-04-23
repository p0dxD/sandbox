package structures;

import java.util.ArrayList;

public class GraphUtil {

    public static <T> void bfs(Graph<T> graph, Vertex<T> node) {
        System.out.println("Start:" + node.getVertexValue());
        Queue<Vertex<T>> queue = new Queue<>();
        node.isVisited(true);
        queue.add(node);

        while (queue.size() > 0) {
            node = queue.poll();
            LinkedListItems<Vertex<T>> edges = graph.getContents().get(node);
            Item<Vertex<T>> items = edges.getItems();
            while (items != null) {
                Vertex<T> item = items.getItem();
                if(!item.isVisited()) {
                    System.out.println("Visiting: " + item.getVertexValue());
                    item.isVisited(true);
                    queue.add(item);
                }
                items = items.nextItem;
            }
        }
    }

    public static <T> int connectedComponnets(Graph<T> graph) {
        int numberOfComponents = 0;
        ArrayList<Vertex<T>> vertices = graph.getVertices();
        for (Vertex<T> vertex: vertices) {
            if (!vertex.isVisited()) {
                numberOfComponents++;
                bfs(graph, vertex);
            }
        }
        return numberOfComponents;
    }
}