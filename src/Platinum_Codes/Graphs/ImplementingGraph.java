package Platinum_Codes.Graphs;

import java.util.Scanner;

public class ImplementingGraph {

    static void addEdges(int src, int dest, int[][] graph, boolean isUndirected) {
        graph[src][dest] = 1;
        if (isUndirected) {
            graph[dest][src] = 1;
        }
    }

    static void printGraph(int[][] graph, int V) {
        System.out.println("\nAdjacency Matrix:");
        System.out.print("   ");
        for (int i = 1; i <= V; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= V; i++) {
            System.out.print(i + "  ");
            for (int j = 1; j <= V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        int[][] graph = new int[V + 1][V + 1]; // 1-based indexing

        System.out.print("Is the graph undirected? (true/false): ");
        boolean isUndirected = sc.nextBoolean();

        System.out.println("Enter " + E + " edges (src dest):");
        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            addEdges(a, b, graph, isUndirected);
        }

        printGraph(graph, V);
    }
}
