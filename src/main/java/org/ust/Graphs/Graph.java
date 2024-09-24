package org.ust.Graphs;

import java.util.*;

class Graph {
    private int vertices;
    protected LinkedList<Integer> adjList[];

    // Constructor to initialize the graph
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge to the graph
    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    // Display the adjacency list
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adjList[i]) {
                System.out.print(" , " + neighbor);
            }
            System.out.println();
        }
    }
}
