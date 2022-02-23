package arrays;

import java.util.Scanner;

public class MoveAllXsAtEnd {
    static int count = 0;
    static String getFStr = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        getTheString(str, 0);
        for( int i = 0; i < count; i++){
            getFStr = getFStr + "x";
        }
        System.out.println(getFStr);
    }

    private static String getTheString(String str, int i) {
        if(i == str.length()){
            return "";
        }
        if(str.charAt(i) == 'x'){
            count++;
            getTheString( str, i + 1);
        }else {
            getFStr = getFStr + str.charAt(i);
            getTheString( str, i + 1);
        }
        return str;
    }

}
