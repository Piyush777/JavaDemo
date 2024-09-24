package org.ust.Graphs;

import java.util.Stack;

class TopologicalSort {
    private Graph graph;
    private boolean[] visited;
    private Stack<Integer> stack;

    public TopologicalSort(Graph graph, int vertices) {
        this.graph = graph;
        visited = new boolean[vertices];
        stack = new Stack<>();
    }

    public void topologicalSortUtil(int vertex) {
        visited[vertex] = true;

        for (int neighbor : graph.adjList[vertex]) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor);
            }
        }

        // Push the current vertex onto the stack after visiting all neighbors
        stack.push(vertex);
    }

    public void topologicalSort() {
        for (int i = 0; i < graph.adjList.length; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i);
            }
        }

        // Print contents of the stack in reverse order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
