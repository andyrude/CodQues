package arrays;

import java.util.Scanner;

public class CDiffWaysToExpNSumOf124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getCountDiff(n));
    }

    private static int getCountDiff(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for( int i = 4; i < n + 1; i++){
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }

        return dp[n];
    }
}
