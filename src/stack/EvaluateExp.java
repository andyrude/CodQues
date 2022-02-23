package stack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0; i < n+1 ; i++) {
            Stack<Integer> stack = new Stack<>();
            String p = sc.nextLine();
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '+' || p.charAt(j) == '-' || p.charAt(j) == '*' || p.charAt(j) == '/') {
                    int k = Integer.parseInt(String.valueOf(stack.pop()));
                    int l = Integer.parseInt(String.valueOf(stack.pop()));
                    int m = 0;
                    switch (p.charAt(j)) {
                        case '+':
                            m = stack.push(k + l);
                            break;
                        case '-':
                            m = stack.push(l - k);
                            break;
                        case '*':
                            m = stack.push(k * l);
                            break;
                        case '/':
                            m = stack.push(l / k);
                            break;
                    }
                    if( j == p.length() - 1){
                        System.out.println(m);
                        stack.pop();
                    }
                } else {
                    stack.push(Integer.parseInt(String.valueOf(p.charAt(j))));
                }
            }
        }
    }
}
