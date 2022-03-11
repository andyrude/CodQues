package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill( dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(getFibonacciSeq( n, dp));
        System.out.println(Arrays.toString(dp));
    }

    private static int getFibonacciSeq(int n, int[] dp) {
        if ( n == 0 || n == 1){
            return 1;
        }
        if ( dp[n ] != -1){
            return dp[n ];
        }
        dp[n ] = getFibonacciSeq( n - 1, dp) + getFibonacciSeq( n - 2, dp);
        return dp[n ];
    }
}
