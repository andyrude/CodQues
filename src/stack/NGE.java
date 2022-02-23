package stack;

import java.util.Scanner;

public class NGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0; i < n ; i++){
            sc.nextLine();
            int m = sc.nextInt();
            int[] arr = new int[m];
            for( int j = 0; j < m; j++){
                arr[j] = sc.nextInt();
            }
            findNextBigInteger( arr, m);
        }
    }

    private static void findNextBigInteger(int[] arr, int m) {
        for (int i = 0; i < m-1; i++){
            for (int j = i + 1 ; j < m; j++){
                if(arr[i] < arr[j]){
                    System.out.println(arr[i] + "," + arr[j]);
                    break;
                }else if( j==m-1 ){
                    System.out.println(arr[i] + ",-1" );
                }
            }
        }
        System.out.println(arr[m-1]+",-1");
    }
}
