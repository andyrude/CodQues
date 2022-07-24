package dynamicprogramming;

import java.util.Scanner;

public class FiboII {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println( fiboN( n));
    }

    private static int fiboN(int n) {
        int a=1,b=0,c;
        while(n--> 0){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
