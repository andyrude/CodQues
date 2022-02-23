package stack;

import java.util.Scanner;
import java.util.Stack;

public class KST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            int p = k == 1? 0: sc.nextInt();
            stack = solveQ( k , p , stack);
        }
    }

    private static Stack<Integer> solveQ(int k, int p, Stack<Integer> stack) {
        if( k==1 ){
            System.out.println(stack.pop());
             return stack;
        }else {
            stack.push(p);
            return stack;
        }
    }
}
