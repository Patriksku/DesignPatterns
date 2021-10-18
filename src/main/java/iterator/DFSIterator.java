package iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Iterator for DFS traversal of graph.
 */
public class DFSIterator implements Iterator<Integer> {
    private int startVertex;
    private Stack<Integer> stack = new Stack<>();
    private boolean[] visited;
    private Graph graph;

    public DFSIterator(int source, Graph graph) {
        startVertex = source;
        this.graph = graph;
        visited = new boolean[graph.getSize()];

        stack.push(source);
    }

    @Override
    public boolean hasNext() {
        return stack.size() != 0;
    }

    @Override
    public Integer next() {
        int current = stack.pop();
        int print = -1;

        if (!visited[current]) {
            visited[current] = true;
            print = current;
        }

        for (int nextNeighbour : graph.getAdjList()[current]) {
            if (!visited[nextNeighbour]) {
                stack.push(nextNeighbour);
            }
        }
        return print;
    }
}

