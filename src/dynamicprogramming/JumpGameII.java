package dynamicprogramming;

import java.util.Scanner;

public class JumpGameII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] intArr = new int[arr.length];
        for( int i = 0; i < args.length; i++){
            intArr[i] = IntegerRe.parseInt(arr[i]);
        }
        int currIndex = args.length - 1;
        for ( int i = args.length;  i >= 0; i--){
            if( i + intArr[i] >= currIndex ){
                currIndex = i;
            }
        }
        System.out.println(currIndex);
        if( currIndex == 0){
            System.out.println(true);
        }
    }
}
