package iterator;

import java.util.*;

/**
 * Directed graph using adjacency list.
 */
public class Graph {

    private final LinkedList<Integer>[] adj; //Adjacency List
    private int size;

    public Graph(int v) {
        this.size = v;

        // Number of vertices
        adj = new LinkedList[v];

        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Add edge from v to w in the graph.
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public int getSize() {
        return size;
    }

    public LinkedList<Integer>[] getAdjList() {
        return adj;
    }
}