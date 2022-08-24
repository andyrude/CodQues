package arrays;

import java.util.Scanner;

public class PowerOfFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println( n & (n - 1));
    }
}
