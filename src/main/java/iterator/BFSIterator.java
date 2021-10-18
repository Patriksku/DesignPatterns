package iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Iterator for BFS traversal of graph.
 */
public class BFSIterator implements Iterator<Integer> {
    private int startVertex;
    private LinkedList<Integer> q = new LinkedList<>();
    private boolean[] visited;
    private Graph graph;

    public BFSIterator(int source, Graph graph) {
        startVertex = source;
        this.graph = graph;
        visited = new boolean[graph.getSize()];

        visited[source] = true;
        q.add(source);
    }

    @Override
    public boolean hasNext() {
        return q.size() != 0;
    }

    @Override
    public Integer next() {
        int current = q.poll();

        for (int nextNeighbour : graph.getAdjList()[current]) {
            if (!visited[nextNeighbour]) {
                visited[nextNeighbour] = true;
                q.add(nextNeighbour);
            }
        }
        return current;
    }
}
