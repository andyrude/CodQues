package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class DisSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int[][] dp = new int[str.length()][str1.length()];
        for (int[] ar:dp){
            Arrays.fill(ar, 0);
        }
        System.out.println(sol( dp, 0, 0, str, str1));
    }

    private static int sol(int[][] dp, int i, int j, String str, String str1) {
        if( j == str1.length()){
            return 1;
        }
        if( i == str.length()){
            return 0;
        }
        int pick = 0;
        if( str.charAt(i) == str1.charAt(j)){
                pick = sol( dp, i + 1, j + 1, str, str1);
        }
        int dontPick = sol( dp, i + 1, j, str, str1);
        return pick + dontPick;
    }
}
