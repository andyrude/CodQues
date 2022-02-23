package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class JumpGameI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        int n = arr.length;
        int[] dp = new int[arr.length ];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;
        for( int i = n - 2; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            for ( int j = i + 1; j <= Math.min( n - 1, i + intArr[i]); j++){
                min = Math.min( min, dp[j]);
            }
            if( min != Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }
        System.out.println(dp[0]);
    }
}
