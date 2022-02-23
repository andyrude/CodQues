package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> arrList = getSubseq( str);
        System.out.println(arrList);
    }

    private static ArrayList<String> getSubseq(String str) {
        if(str.length()==0){
            ArrayList<String> hh = new ArrayList<>();
            hh.add(" ");
            return hh;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSubseq(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (String rstr: rres) {
                mres.add("" + rstr);
                mres.add(ch + rstr);
        }
        return mres;
    }
}
