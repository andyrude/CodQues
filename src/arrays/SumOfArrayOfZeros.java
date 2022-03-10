package arrays;

import java.util.Scanner;

public class SumOfArrayOfZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println( find( arr));
    }

    private static int find(int[] arr) {
        int c = 0;
        int check = 0;
        for ( int i = 0; i < arr.length; i++){
            if ( arr[i] == 0){
                c++;
                check = check + c;
            }else {
                c = 0;
            }
        }
        return check;
    }
}
