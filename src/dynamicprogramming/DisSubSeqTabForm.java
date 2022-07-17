package dynamicprogramming;

import java.util.Scanner;

public class DisSubSeqTabForm {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println( getDistSubSeq( str, str1));
    }

    private static int getDistSubSeq(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int[][] dp =new int[len1+1][len2+1];
        char[] st = s.toCharArray();
        char[] p = t.toCharArray();
        dp[len1][len2] = 1;

        return dp[0][0];
    }
}
