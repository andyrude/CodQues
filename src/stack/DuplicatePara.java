package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicatePara {
    public static boolean hasDuplicateParenthesis(String exp)
    {
        if (exp == null || exp.length() <= 3) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c: exp.toCharArray())
        {
            if (c != ')') {
                stack.push(c);
            }
            else {

                if (stack.peek() == '(') {
                    return true;
                }

                while (stack.peek() != '(') {
                    stack.pop();
                }

                stack.pop();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            String p = sc.nextLine();
            System.out.println(p);
            if(hasDuplicateParenthesis(p)){
                System.out.println("Duplicate");
            }else {
                System.out.println("Not Duplicates");
            }
        }
    }
}
