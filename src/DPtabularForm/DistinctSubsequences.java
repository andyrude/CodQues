package DPtabularForm;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctSubsequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println( getDistSubseq( str, str1));
    }

    private static int getDistSubseq(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int[][] dp =new int[len1+1][len2+1];
        char[] st = s.toCharArray();
        char[] p = t.toCharArray();
        dp[len1][len2] = 1;
        for(int i = len1-1 ; i >= 0 ; i--) {
            dp[i][len2] = 1;
            for(int j = len2-1 ; j >= 0 ; j--) {
                if(st[i] == p[j]) {
                    dp[i][j] = dp[i+1][j+1]+dp[i+1][j];
                }
                else {
                    dp[i][j] = dp[i+1][j];
                }
            }
        }
        for( int i = 0; i < s.length(); i++){
            System.out.println( Arrays.toString( dp[i]));
        }
        return dp[0][0];
    }


}
