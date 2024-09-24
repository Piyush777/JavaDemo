package org.ust.Graphs;

class DFS {
    private Graph graph;
    private boolean[] visited;

    public DFS(Graph graph, int vertices) {
        this.graph = graph;
        visited = new boolean[vertices];
    }

    // Recursive function for DFS traversal
    public void dfs(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : graph.adjList[vertex]) {

            if (!visited[neighbor]) {
                dfs(neighbor);
            }

        }
    }
}
