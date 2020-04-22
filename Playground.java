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
        
        Vertex<Integer> one = new Vertex<>(1);
        Vertex<Integer> two = new Vertex<>(2);
        Vertex<Integer> three = new Vertex<>(3);
        Vertex<Integer> four = new Vertex<>(4);
        Vertex<Integer> five = new Vertex<>(5);

        Edge<Integer> edgeOne = new Edge<>(one, two, 0);
        Edge<Integer> edgeTwo = new Edge<>(one, five, 0);
        Edge<Integer> edgeThree = new Edge<>(two, one, 0);
        Edge<Integer> edgeFour = new Edge<>(two, five, 0);
        Edge<Integer> edgeFive = new Edge<>(two, three, 0);
        Edge<Integer> edgeSix = new Edge<>(two, four, 0);
        Edge<Integer> edgeSeven = new Edge<>(three, two, 0);
        Edge<Integer> edgeEight = new Edge<>(three, four, 0);
        Edge<Integer> edgeNine = new Edge<>(four, two, 0);
        Edge<Integer> edgeTen = new Edge<>(four, five, 0);
        Edge<Integer> edgeEleven = new Edge<>(four, three, 0);
        Edge<Integer> edgeTwelve = new Edge<>(five,four, 0);
        Edge<Integer> edgeThirdteen = new Edge<>(five, one, 0);
        Edge<Integer> edgeFourteen = new Edge<>(five, two, 0);


        ArrayList<Vertex<Integer>> vertices = new ArrayList<>();
        vertices.add(one);
        vertices.add(two);
        vertices.add(three);
        vertices.add(four);
        vertices.add(five);
        ArrayList<Edge<Integer>> edges = new ArrayList<>();
        edges.add(edgeOne);
        edges.add(edgeTwo);
        edges.add(edgeThree);
        edges.add(edgeFour);
        edges.add(edgeFive);
        edges.add(edgeSix);
        edges.add(edgeSeven);
        edges.add(edgeEight);
        edges.add(edgeNine);
        edges.add(edgeTen);
        edges.add(edgeEleven);
        edges.add(edgeTwelve);
        edges.add(edgeThirdteen);
        edges.add(edgeFourteen);

        
        Graph<Integer> graph = new Graph<>(vertices, edges);
        graph.initialize();
        graph.printGraph();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}


