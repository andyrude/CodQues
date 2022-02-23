package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class lengthoflcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int[][] dp = new int[ str.length()][str2.length()];
        for( int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(getLCS( str, str2, 0, 0, dp));
    }

    private static int getLCS(String str, String str2, int i, int j, int[][] dp) {
        if(i == str.length() || j == str2.length()){
            return 0;
        }
        if( dp[i][j] != -1){
            return dp[i][j];
        }
        if( str.charAt(i) == str2.charAt(j)){
            dp[i][j] = getLCS( str, str2, i + 1, j + 1, dp) + 1;
        }
        else {
            dp[i][j] = Math.max( getLCS(str, str2, i + 1, j, dp), getLCS( str, str2, i, j + 1, dp));
        }
        return dp[i][j];
    }
}
