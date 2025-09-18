package Platinum_Codes.Graphs;

import java.util.*;

public class listImplementation {

    static ArrayList<Integer> adj[];
    static int V;

    listImplementation(int vertices) {
        V = vertices; // Assign to static V
        adj = new ArrayList[V + 1];
        for (int i = 0; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    static void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    static void printGraph() {
        for (int i = 1; i <= V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    static void BFS(int start) {
        boolean[] visited = new boolean[V + 1];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int n = queue.poll();
            System.out.print(n + " ");

            for (int x : adj[n]) {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
        System.out.println();
    }

    static void DFS(int n, boolean[] visited) {
        visited[n] = true;
        System.out.print(n + " ");

        for (int x : adj[n]) {
            if (!visited[x]) {
                DFS(x, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of vertices : ");
        V = sc.nextInt(); // assign to static V

        System.out.print("Enter no. of Edges : ");
        int E = sc.nextInt();

        listImplementation g = new listImplementation(V);

        System.out.println("Enter edges (src dest): ");
        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            addEdge(a, b);
        }

        System.out.println("\nAdjacency List : ");
        printGraph();

        System.out.print("\nEnter starting node for BFS: ");
        int start = sc.nextInt();
        BFS(start);

        System.out.print("\nEnter starting node for DFS: ");
        int startDFS = sc.nextInt();
        boolean[] visited = new boolean[V + 1];
        System.out.print("DFS Traversal: ");
        DFS(startDFS, visited);
        System.out.println();
    }
}
