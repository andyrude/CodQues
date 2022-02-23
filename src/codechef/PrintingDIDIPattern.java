package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingDIDIPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = getSeq(str);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getSeq(String str) {
        int[] arr = new int[str.length() + 1];
        int count = 1;
        for( int i = 0; i < arr.length; i++){
            if( i == str.length() || str.charAt(i) == 'I'){
                arr[i] = count;
                count++;
                int j = i - 1;
                while ( j >= 0 && str.charAt(j) == 'D'){
                    arr[j] = count;
                    count++;
                    j--;
                }
            }
        }
        return arr;
    }
}
