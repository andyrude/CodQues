package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first array");
        String[] arr = sc.nextLine().split(" ");
        int[] po = new int[arr.length];
        for ( int i = 0; i < arr.length; i++){
            po[i] = Integer.parseInt(arr[i]);
        }
        arr = sc.nextLine().split(" ");
        int[] op = new int[arr.length];
        for ( int i = 0; i < arr.length; i++){
            op[i] = Integer.parseInt(arr[i]);
        }
    }
}

class NotIntResultException extends Exception{

}