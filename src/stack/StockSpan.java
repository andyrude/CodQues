package stack;

import java.util.Scanner;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        sc.nextLine();
        System.out.print("1 ");
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        for (int i = 1; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < arr[i-1]){
                k = 1;
                System.out.print(k + " ");
            } if( arr[i] > arr[i-1]){
                k = k + 1;
                System.out.print(k + " ");
            } if( i == n-1){
                System.out.print("END");
            }
        }

    }
}
