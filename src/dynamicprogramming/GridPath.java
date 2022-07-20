package dynamicprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GridPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[][] arr = new int[ n][ 2];


        for( int i = 0; i < n; i++){
            for( int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for( int i = 0; i < n; i++){
            Arrays.sort( arr[i]);
        }
        int i = 0;
        int m = 0;
        int j = 0;
        int k = 0;
        ; for(  i = 0; i < n - 1; i++){
            k = 1;
            for(   j = 1; j >= 0; j--){
                if( arr[i + 1][j] > arr[i][j]){
                    m = m + arr[i][j];
                    break;
                }
                else {
                    k--;
                }
            }
            if( k == -1 && j ==  - 1){
                break;
            }
        }

        if( k == -1 && j == -1){
            System.out.println( m);
            m = m + arr[i ][1];
        }
        else {
            m = m + arr[i][k];
        }
        System.out.println( m);
    }
}
