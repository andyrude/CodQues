package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class KnightDialer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] dp = new int[n][4][3];
        for ( int[][] ar: dp){
            for (int[] arr: ar){
                Arrays.fill(arr,-1);
            }
        }
        int ans = 0;
        for( int i = 0; i < 4; i++){
            for( int j = 0; j < 3; j++){
                ans = (ans + knightDialer( n-1  , i ,j, dp))%(1000_000_007);
            }
        }
        System.out.println(Arrays.toString(dp[0][1]));
        System.out.println(ans);
    }

    private static int knightDialer(int n, int cr, int cc, int[][][] dp) {

        if(  cr < 0 || cc < 0 || cr >= 4 || cc >= 3 || (cr == 3 && cc == 0) || ( cr == 3 && cc == 2) ){
            return 0;
        }
        if( n < 0){
            return 1;
        }
        if( dp[n][cr][cc] != -1){
            return dp[n][cr][cc];
        }
        int r[] = { -2, -2, -1, -1, 1, 1, 2, 2};
        int c[] = { -1, 1, -2, 2, -2, 2, -1, 1};
        int count = 0;
        for( int i = 0; i < c.length; i++){
            count = (count + knightDialer( n - 1, cr + r[i], cc + c[i], dp))%(1000_000_007);
        }
        return dp[n][cr][cc] = count;
    }
}
