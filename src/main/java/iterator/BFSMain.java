package iterator;

public class BFSMain {

    public static void main(String[] args) {
        Graph g1 = new Graph(4);
        Graph g2 = new Graph(5);
        Graph g3 = new Graph(11);
        int startV = 2;
        int startV2 = 0;
        int startV3 = 1;

        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 0);
        g1.addEdge(2, 3);
        g1.addEdge(3, 3);

        g2.addEdge(1, 0);
        g2.addEdge(0, 2);
        g2.addEdge(2, 1);
        g2.addEdge(0, 3);
        g2.addEdge(1, 4);

        g3.addEdge(1, 3);
        g3.addEdge(3, 6);
        g3.addEdge(6, 10);
        g3.addEdge(1, 7);
        g3.addEdge(7, 2);
        g3.addEdge(1, 0);
        g3.addEdge(0, 5);

        System.out.println("BFS Traversal, starting from vertex: " + startV);

        BFSIterator bfs = new BFSIterator(startV3, g3);

        while (bfs.hasNext()) {
            System.out.print(bfs.next());
            if (bfs.hasNext()) System.out.print("\t");
        }
    }
}
