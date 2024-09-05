import java.util.*;

public class OlympicAths {

    // Define a class to represent the edge with destination node and weight
    static class Edge {
        int destination, weight;
        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of checkpoints and roads
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Create adjacency list for the graph
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read the roads and add edges to the graph
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        // Use Dijkstra's algorithm to find the shortest path from node 1 to node n
        int result = dijkstra(n, graph);
        System.out.println(result);

        scanner.close();
    }

    private static int dijkstra(int n, List<List<Edge>> graph) {
        // Distance array initialized to infinity
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0; // Start from node 1

        // Priority queue to hold nodes to explore, initialized with the starting node
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{1, 0}); // {node, distance}

        // Process the nodes
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int currentDist = current[1];

            if (currentDist > dist[u]) {
                continue;
            }

            // Explore the neighbors of node u
            for (Edge edge : graph.get(u)) {
                int v = edge.destination;
                int weight = edge.weight;

                // Check if a shorter path is found
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }

        // Return the shortest distance to node n
        return dist[n] == Integer.MAX_VALUE ? -1 : dist[n];
    }
}

