public class SumZero {
        public static int[] sumZero(int n) {
                    int[] result = new int[n];
                    int index = 0;
                    for (int i = 1; i <= n / 2; i++) {
                        result[index++] = i;
                        result[index++] = -i;
                    }
                    if (n % 2 != 0) {
                        result[index] = 0;
                    }
                    
                    return result;
                }
        
                public static void main(String[] args) {
                    int[] res = sumZero(5);
                    for (int i: res) {
                        System.out.println(i);
                    }
        }
}
