package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class lcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        System.out.println(getlCS( str1, str2, n, m));
    }

    private static int getlCS(String str1, String str2, int n, int m) {
        int[][] arr = new int[n][m];
        for( int i = 0; i < n; i++){
            for( int j = 0; j < m; j++){
                if( str1.charAt(i) == str2.charAt(j)){
                    arr[i][j] = ((i > 0 && j>0)? arr[i - 1][j - 1]: 0) + 1;
                }else {
                    arr[i][j] = Math.max(i > 0 ? arr[i - 1][j] : 0, j > 0 ? arr[i][j - 1] : 0);
                }
            }
        }
        for( int i = 0; i < n; i++){
            System.out.println(Arrays.toString( arr[i]));
        }
        return arr[n-1][m-1];
    }
}
