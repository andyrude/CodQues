package arrays;

import java.util.Scanner;
import java.util.Stack;

public class KSC {

    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for ( int i = 0; i < n; i++){
            int k = sc.nextInt();
            if( k == 2){
                int l = sc.nextInt();
                query1( l);
            }else{
                if( stack.isEmpty())
                System.out.println( stack.pop());
            }
            sc.nextLine();
        }
    }

    private static void query1(int l) {
        stack.push(l);
    }
}

