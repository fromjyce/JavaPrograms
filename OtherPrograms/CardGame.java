import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int maxAnkita = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                maxAnkita = Math.max(maxAnkita, a[i]);
            }
            
            int m = scanner.nextInt();
            int[] b = new int[m];
            int maxBiswas = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
                maxBiswas = Math.max(maxBiswas, b[i]);
            }
            
            // Determine who wins if Ankita starts
            if (maxAnkita >= maxBiswas) {
                System.out.println("Ankita");
            } else {
                System.out.println("Biswas");
            }
            
            // Determine who wins if Biswas starts
            if (maxBiswas >= maxAnkita) {
                System.out.println("Biswas");
            } else {
                System.out.println("Ankita");
            }
        }
        
        scanner.close();
    }
}
