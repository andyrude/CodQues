package dpAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistSubSeq {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int i = 0, j = 0;
        int[][] dp = new int[str1.length()][str2.length()];
        System.out.println( disSubSeq( str1, str2, i, j, dp));
    }

    private static int disSubSeq(String str1, String str2, int i, int j, int[][] dp){
            if( j == str2.length()){
                return 1;
            }
            if ( i == str1.length()){
                return 0;
            }
            int inc = 0;
            int exc = 0;
            if( str1.charAt(i) == str2.charAt(j)){
                inc = disSubSeq( str1, str2, i + 1, j + 1, dp);
            }
            exc = disSubSeq( str1, str2, i + 1, j , dp);
            return inc + exc;
    }
}
