package Platinum_Codes.Graphs;

import java.util.ArrayList;
import java.util.Iterator;

public class findDegree {

    public static void main(String[] args) {
        // Example graph as adjacency matrix
        int[][] graph = {
                {0, 1, 0, 0},
                {0, 0, 1, 1},
                {1, 0, 0, 0},
                {0, 0, 1, 0}
        };

        int node = 1;
        System.out.println("In-degree of node " + node + ": " + inDegree(node, graph));
        System.out.println("Out-degree of node " + node + ": " + outDegree(node, graph));

        System.out.println("\nTranspose of the graph (Adjacency List):");
        ArrayList<ArrayList<Integer>> transposed = transposeGraph(graph);
        printAdjList(transposed);
    }

    // Calculates In-Degree of a given node
    static int inDegree(int ele, int[][] graph) {
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            if (graph[i][ele] == 1) {
                count++;
            }
        }
        return count;
    }

    // Calculates Out-Degree of a given node
    static int outDegree(int ele, int[][] graph) {
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            if (graph[ele][i] == 1) {
                count++;
            }
        }
        return count;
    }

    static ArrayList<ArrayList<Integer>> transposeGraph(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> transposedAdjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            transposedAdjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    transposedAdjList.get(j).add(i);
                }
            }
        }
        return transposedAdjList;
    }

    static void printAdjList(ArrayList<ArrayList<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
