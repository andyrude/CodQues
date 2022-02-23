package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class lCS {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.nextLine();
        sc.nextLine();
        String str2 = sc.nextLine();
        int[][] arr = new int[n + 5][ n + 5];
        for ( int i = 0; i < n ; i++){
            Arrays.fill(arr[i], -1);
        }
        System.out.println(getLCS( str1, str2, 0, 0, arr));
     }

    private static int getLCS(String str1, String str2,  int i, int j, int[][] arr) {
        if( i == 0 || j == 0){
            return 0;
        }if( arr[i][j] != -1){
            return -1;
        }
        if( str1.charAt(i) == str2.charAt(j) ){
            return arr[i][j] = 1 + getLCS(str1,str2,i + 1,j + 1,arr);
        }else {
            return arr[i][j] = Math.max(getLCS(str1, str2, i+1, j, arr), getLCS(str1, str2, i, j + 1,arr));
        }
    }
}
