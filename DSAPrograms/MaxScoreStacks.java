package DSAPrograms;

import java.util.*;

public class MaxScoreStacks {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int T = scan.nextInt();
    int[] testcases = new int[T];
    int maxN = 0;
    
    for(int i=0; i< T; i++) {
    	testcases[i] = scan.nextInt();
      if(testcases[i] > maxN) {
      	maxN = testcases[i];
      }
    }
    
    long[] dp = new long[maxN+1];
    dp[1] = 0;
    
    for(int i = 2; i<=maxN; i++) {
      for(int j = 1; j < i; j++) {
      	dp[i] = Math.max(dp[i], (long)j * (i-j) + dp[j] + dp[i - j]);
      }
    }
    
    for(int i = 0; i < T; i++) {
    	System.out.println(dp[testcases[i]]);
    }

    scan.close();
  
  }

}