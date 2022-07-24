package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {

    private List< String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println( printParathesis( n));
    }

    public static List<String> printParathesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate(ans, "", n, n);
        return ans;
    }
    public static void  generate(ArrayList ans, String s, int l, int r){
        if(l == 0 && r == 0){
            ans.add(s);
            return;
        }
        if(l > 0) generate(ans, s + "(", l - 1, r);
        if(r > l) generate(ans, s + ")", l, r - 1);
    }
}
