package arrays;

import java.util.Scanner;

public class Mountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println( getMinOper( arr));
    }

    private static int getMinOper(int[] arr) {
        int[] arr2 = new int[arr.length - 1];
        for( int i = 0; i < arr2.length; i++){
            arr[i] = arr[i + 1] - arr[i ];
        }
        if( arr.length % 2 == 0){

        }
        return 0;
    }
}
