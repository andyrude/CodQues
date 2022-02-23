package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PosSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        getSpan( n, arr);
    }

    private static void getSpan(int n, int[] arr) {
        int[] ar = new int[arr.length];
        Arrays.fill(ar, -1);
        Stack<Integer> st = new Stack<Integer>();
        for( int i = 0; i <ar.length; i++){
            while ( st.isEmpty() == false && arr[i] > arr[st.peek()]){
                ar[st.pop()] = arr[i];
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ar));
    }
}
