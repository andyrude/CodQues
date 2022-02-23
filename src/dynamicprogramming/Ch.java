package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rp = sc.nextLine().split("");
        System.out.println(Arrays.toString(rp));
        ArrayList<String> arrayList = new ArrayList<String>();
        for( String s : rp){
           if( arrayList.contains(s)){
               continue;
           }else {
               arrayList.add(s);
           }
        }
        System.out.println(arrayList.toString());
    }
}
