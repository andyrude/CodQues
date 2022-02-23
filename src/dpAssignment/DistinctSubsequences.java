package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[][] dp = new int[str1.length()][str2.length()];
        System.out.println(getMaxSubeq( dp, 0, 0,str1, str2));
    }

    private static int getMaxSubeq(int[][] dp, int i, int j, String str, String str1) {
        if( j == str1.length()){
            return 1;
        }
        if( i == str.length()){
            return 0;
        }
        int pick = 0;
        if( str.charAt(i) == str1.charAt(j)){
            pick = getMaxSubeq( dp, i + 1, j + 1, str, str1);
        }
        int dontPick = getMaxSubeq( dp, i + 1, j, str, str1);
        return pick + dontPick;
    }
}
