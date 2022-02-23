package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int[] row: dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(sol(s,t,0, 0));
    }

    private static int sol( String s, String t, int currS, int currT){
        if(currT == t.length()){
            return 1;
        }
        if(currS == s.length()){
            return 0;
        }
        int pick = 0;
        if(s.charAt(currS) == t.charAt(currT)){
            pick = sol( s, t, currS + 1, currT + 1);
        }
        int dontPick = sol( s, t, currS + 1, currT);
        return pick + dontPick;
    }
}

