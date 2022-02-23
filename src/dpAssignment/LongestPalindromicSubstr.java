package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromicSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        boolean[][] dp = new boolean[str1.length()][str1.length()];
        int len = 0;
        String str = "";
        for ( int g = 0; g < str1.length(); g++){
            for( int i = 0, j = g; j < str1.length(); i++, j++){
                if( g == 0){
                    dp[i][j] = true;
                } else if( g == 1){
                    if( str1.charAt(i) == str1.charAt(j)){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = false;
                    }
                } else {
                    if( str1.charAt(i) == str1.charAt(j) && dp[i + 1][ j - 1] == true){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
                if( dp[i][j]){
                    str = str1.substring(i, j + 1);
                }
            }
        }
        int count = 0;
        for( int i = 0; i < str1.length(); i++){
            for ( int j = 0; j < str1.length(); j++){
                    if( dp[i][j] )
                        count++;

            }
        }
        System.out.println(count);
    }
}