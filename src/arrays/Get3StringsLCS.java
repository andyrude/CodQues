package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Get3StringsLCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int[][][] dp = new int[str.length()][str2.length()][str3.length()];
        for( int[][] arr: dp){
            for ( int[] ar: arr){
                Arrays.fill( ar, - 1);
            }
        }
        System.out.println(getLCS( str, str2, str3, 0, 0, 0, dp));
    }

    private static int getLCS(String str, String str2, String str3, int i, int j, int k, int[][][] dp) {
        if( str.length() == i || str2.length() == j || str3.length() == k){
            return 0;
        }
        if( dp[i][j][k] != -1){
            return dp[i][j][k];
        }
        if( str.charAt(i) == str2.charAt(j) || str2.charAt(j) == str3.charAt(k)){
            return dp[i][j][k] = getLCS( str, str2, str3, i + 1, j + 1, k + 1, dp) + 1;
        }else {
           return dp[i][j][k] = Math.max(Math.max(getLCS( str, str2, str3, i + 1, j, k, dp ), getLCS( str, str2, str3, i, j + 1,  k, dp)), getLCS( str,  str2,  str3,  i,  j,  k + 1, dp));
        }
    }
}
