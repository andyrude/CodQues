package dpAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for( int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[2] + arr[0];
        for( int i = 3; i < arr.length; i++){
            dp[i] = Math.max( dp[i - 2] + arr[i], dp[i - 3] + arr[i]);
        }
        int c = Math.max( dp[ arr.length - 1], dp[arr.length - 2]);
        System.out.println(c);
    }
}
