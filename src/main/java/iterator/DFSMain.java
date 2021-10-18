package iterator;

public class DFSMain {

    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        Graph g2 = new Graph(11);
        int startV = 0;
        int startV2 = 1;

        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(1, 4);

        g2.addEdge(1, 3);
        g2.addEdge(3, 6);
        g2.addEdge(6, 10);
        g2.addEdge(1, 7);
        g2.addEdge(7, 2);
        g2.addEdge(1, 0);
        g2.addEdge(0, 5);


        System.out.println("DFS Traversal, starting from vertex: " + startV);

        DFSIterator dfs = new DFSIterator(startV2, g2);

        while (dfs.hasNext()) {
            int toPrint = dfs.next();

            if (toPrint != -1) {
                if (dfs.hasNext()) {
                    System.out.print(toPrint + "\t");
                } else {
                    System.out.print(toPrint);
                }
            }
        }
    }
}
