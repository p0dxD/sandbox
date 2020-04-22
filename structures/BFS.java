package structures;

public class BFS {

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
}