package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

        System.out.println(getFibonacciSeq( n));;
    }

    private static int getFibonacciSeq(int n) {
        if ( n == 0 || n == 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        if ( dp[n ] != -1){
            return dp[n ];
        }
        dp[n ] = getFibonacciSeq( n - 1) + getFibonacciSeq( n - 2);
        System.out.println(Arrays.toString(dp));
        return dp[n ];
    }
}
