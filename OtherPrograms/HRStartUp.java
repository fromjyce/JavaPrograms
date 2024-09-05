import java.util.*;

public class HRStartUp {

    static class Edge {
        int destination, time;
        Edge(int destination, int time) {
            this.destination = destination;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int timeCutoff = scanner.nextInt();
            
            List<List<Edge>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                graph.get(u).add(new Edge(v, w));
                graph.get(v).add(new Edge(u, w));
            }
            
            int bestDepartment = -1;
            int maxReachable = -1;
            int minTotalTime = Integer.MAX_VALUE;
            
            for (int start = 0; start < n; start++) {
                int[] dist = new int[n];
                Arrays.fill(dist, Integer.MAX_VALUE);
                dist[start] = 0;
                
                PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
                pq.add(new int[]{start, 0});
                
                while (!pq.isEmpty()) {
                    int[] current = pq.poll();
                    int u = current[0];
                    int currentTime = current[1];
                    
                    if (currentTime > dist[u]) continue;
                    
                    for (Edge edge : graph.get(u)) {
                        int v = edge.destination;
                        int time = edge.time;
                        
                        if (dist[u] + time < dist[v]) {
                            dist[v] = dist[u] + time;
                            pq.add(new int[]{v, dist[v]});
                        }
                    }
                }
                
                int reachableCount = 0;
                int totalTime = 0;
                for (int i = 0; i < n; i++) {
                    if (i != start && dist[i] <= timeCutoff) {
                        reachableCount++;
                        totalTime += dist[i];
                    }
                }
                
                if (reachableCount > maxReachable ||
                   (reachableCount == maxReachable && totalTime < minTotalTime) ||
                   (reachableCount == maxReachable && totalTime == minTotalTime && start > bestDepartment)) {
                    maxReachable = reachableCount;
                    minTotalTime = totalTime;
                    bestDepartment = start;
                }
            }
            
            System.out.println(bestDepartment);
        }
        
        scanner.close();
    }
}
