package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int highVal = sc.nextInt();
        int lenArr = sc.nextInt();
        getVal( highVal, lenArr);
    }

    private static void getVal(int highVal, int lenArr) {
        int[] arr = new int[ highVal];
        for( int i = 0; i < highVal; i++){
            arr[i] = highVal + 1;
        }

        int[][] dp = new int[ highVal][ highVal];

        for ( int i = 0; i < highVal; i++){
            for ( int j= 0; j < highVal; j++){
                if ( i > j){
                    continue;
                } else if ( (j+1) % (i+1) == 0) {
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        int[] ls = new int[highVal];

        for ( int i = 0; i < highVal; i++){
            for ( int j = 0; j < highVal; j++){
                if( dp[i][j] == 1){
                    ls[i]+=1;
                }
            }
        }

        System.out.println(Arrays.toString(ls));


    }
}
