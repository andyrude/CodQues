package dpAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {
    static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "(";
        int  count = getGeneratePara( n - 1, n , str);
        for ( int i = 0; i < arrayList.size(); i++){
            System.out.print( arrayList.get(i) + ", ");
        }
    }

    private static int getGeneratePara(int n ,int k, String str) {
        if ( n == 0 && k == 0){
            arrayList.add(str);
            return 1;
        }
        if( k < n){
            return 0;
        }
        int count = 0;
        if( k >= 0) {
            count = getGeneratePara(n, k - 1, str + ")");
        }
        if( n >= 0) {
            count = getGeneratePara(n - 1, k, str + "(");
        }
        return count;
    }
}
