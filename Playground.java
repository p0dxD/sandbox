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


