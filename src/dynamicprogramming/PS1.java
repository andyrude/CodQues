//package dynamicprogramming;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class PS1 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int p = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        HashMap<IntegerRe, IntegerRe> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                int k = map.get(arr[i]);
//                k = k + 1;
//                map.replace(arr[i], k);
//            } else {
//                map.put(arr[i], 1);
//            }
//        }
//        int t , r = 0;
//        if( arr.length % 2 == 0){
//
//        }
//        int m = 0;
//        int[][] dp = new int[1][p];
//        for( int i = 0; i < 1; i++){
//
//        }
//
//
//            for ( int i = 0; i < 1; i++){
//            System.out.println(Arrays.toString( dp[i]));
//        }
//
//    }
//}
