package arrays;

import java.util.*;

public class ST1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int ie = sc.nextInt();
        int[] arr = new int[ n];
        for( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[ n ];
        for( int i = 0; i < n ; i++){
             arr2[i] = sc.nextInt();
        }
        System.out.println(letsSee( arr, arr2, ie));
    }

    private static int letsSee(int[] arr, int[] arr2, int ie) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < arr.length; i++){
            map.put( arr[i], arr2[i]);
        }
        Arrays.sort( arr);
        int k = 0;
        for( int i = 0 ; i < arr.length; i++){
            if( arr[i] <= ie) {
                ie += map.get( arr[i]);
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}
