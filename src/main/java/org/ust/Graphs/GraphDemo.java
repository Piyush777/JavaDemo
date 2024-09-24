package org.ust.Graphs;

public class GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println("Graph adjacency list:");
        graph.printGraph();

        System.out.println("\nDFS starting from vertex 5:");
        DFS dfs = new DFS(graph, 6);
        dfs.dfs(5);

        System.out.println("\n\nBFS starting from vertex 5:");
        BFS bfs = new BFS(graph);
        bfs.bfs(5);

        System.out.println("\n\nTopological Sort:");
        TopologicalSort ts = new TopologicalSort(graph, 6);
        ts.topologicalSort();
    }
}
