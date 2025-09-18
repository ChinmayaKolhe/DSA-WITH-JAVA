package Platinum_Codes.Graphs;

import java.util.ArrayList;
import java.util.Iterator;

public class isCyclic {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void main(String[] args) {
        int vertices = 5;
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 1);

        boolean[] visited = new boolean[vertices];
        boolean cycleFound = false;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclic(i, visited, -1)) {
                    cycleFound = true;
                    break;
                }
            }
        }

        System.out.println("Cycle present? " + cycleFound);
    }

    static void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static boolean isCyclic(int v, boolean[] visited, int parent) {
        visited[v] = true;
        Iterator<Integer> it = adj.get(v).iterator();

        while (it.hasNext()) {
            int i = it.next();
            if (!visited[i]) {
                if (isCyclic(i, visited, v)) {
                    return true;
                }
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }
}
