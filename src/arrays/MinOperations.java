package arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++){
            int num = sc.nextInt();
            sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            System.out.println( getSol( n, arr));
        }
    }

    private static int getSol(int n, String[] arr) {
        int [] intArr = new int [arr.length];
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Map< Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < intArr.length; i++){
            if( map.containsKey(intArr[i])){
                int k = map.get( intArr[i]);
                k++;
                map.replace( intArr[i], k);
            }else{
                map.put( intArr[i], 1);
            }
        }
        int k = Collections.max( map.values());
        return intArr.length - k;
    }
}
