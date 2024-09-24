package org.ust.Graphs;

import java.util.LinkedList;
import java.util.Queue;

class BFS {
    private Graph graph;

    public BFS(Graph graph) {
        this.graph = graph;
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[graph.adjList.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : graph.adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
