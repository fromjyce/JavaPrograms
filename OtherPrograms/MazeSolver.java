import java.util.*;

public class MazeSolver {

    static class Graph {
        private final int V;
        private final List<List<Integer>> adj;

        // Constructor
        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        // Add edge to the graph
        public void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // BFS to find the shortest path
        public List<Integer> bfs(int start, int end) {
            boolean[] visited = new boolean[V];
            int[] parent = new int[V];
            Queue<Integer> queue = new LinkedList<>();
            List<Integer> path = new ArrayList<>();
            
            Arrays.fill(parent, -1);
            visited[start] = true;
            queue.add(start);
            
            while (!queue.isEmpty()) {
                int node = queue.poll();
                
                if (node == end) {
                    // Reconstruct the path
                    for (int at = end; at != -1; at = parent[at]) {
                        path.add(at);
                    }
                    Collections.reverse(path);
                    return path;
                }
                
                for (int neighbor : adj.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        parent[neighbor] = node;
                        queue.add(neighbor);
                    }
                }
            }
            return Collections.emptyList();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of junction points
            int a = scanner.nextInt(); // number of edges
            Graph graph = new Graph(n);

            for (int i = 0; i < a; i++) {
                int x = scanner.nextInt() - 1; // 0-indexed
                int y = scanner.nextInt() - 1; // 0-indexed
                graph.addEdge(x, y);
            }

            List<Integer> path = graph.bfs(0, n - 1); // Start BFS from node 1 (index 0) to node n (index n-1)

            if (path.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(String.join(" ", path.stream().map(v -> Integer.toString(v + 1)).toArray(String[]::new)));
            }
        }
        scanner.close();
    }
}
