import java.util.*;

public class PaintCubes {
    
    static int[] parent;
    
    // Find the representative of a set with path compression
    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }
    
    // Union two sets
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY; // merge the two sets
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        
        parent = new int[100001];
        for (int i = 1; i <= 100000; i++) {
            parent[i] = i; // initially each color points to itself
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int color = sc.nextInt();
                result.add(find(color)); // add the current representative color
            } else if (type == 2) {
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
                if (find(c1) != find(c2)) {
                    union(c1, c2); // merge c1 into c2
                }
            }
        }
        
        StringBuilder output = new StringBuilder();
        for (int color : result) {
            output.append(color).append(" ");
        }
        
        System.out.println(output.toString().trim());
        sc.close();
    }
}
