package DAA;
import java.util.*;

public class DijkstraAmbulance {

    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.first, other.first);
        }
    }

    public static void dijkstra(int source, List<List<Pair>> graph, int[] dist) {
        int V = graph.size();
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, source));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.second;
            int d = current.first;

            if (d > dist[u]) continue;

            for (Pair edge : graph.get(u)) {
                int v = edge.first;
                int w = edge.second;

                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(dist[v], v));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of intersections (vertices): ");
        int V = scanner.nextInt();
        System.out.print("Enter number of roads (edges): ");
        int E = scanner.nextInt();

        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v w):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        System.out.print("Enter ambulance start location (source): ");
        int source = scanner.nextInt();

        System.out.print("Enter number of hospitals: ");
        int H = scanner.nextInt();
        int[] hospitals = new int[H];
        System.out.print("Enter hospital nodes: ");
        for (int i = 0; i < H; i++) {
            hospitals[i] = scanner.nextInt();
        }

        int[] dist = new int[V];
        dijkstra(source, graph, dist);

        int minTime = Integer.MAX_VALUE;
        int nearestHospital = -1;

        for (int h : hospitals) {
            if (dist[h] < minTime) {
                minTime = dist[h];
                nearestHospital = h;
            }
        }

        if (nearestHospital == -1) {
            System.out.println("No hospital reachable.");
        } else {
            System.out.println("Nearest hospital is at node " + nearestHospital +
                    " with travel time " + minTime + " minutes.");
        }

        scanner.close();
    }
}