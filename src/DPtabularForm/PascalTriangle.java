package DPtabularForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println(getSol( n));
    }

    private static List<List<Integer>> getSol(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(1);
        list.add(new ArrayList<>(li));
        if( n == 1){
            return list;
        }

        li.add( 1);
        list.add(new ArrayList<>(li));
        if( n == 2){
            return list;
        }

        for( int  i = 3; i <= n ; i++){
            List<Integer> li2 = new ArrayList<>();
            li2.add( li.get(0));
            for ( int j = 1; j < li.size(); j++){
                li2.add( li.get( j - 1) + li.get(j ));
            }
            li2.add( li.get( li.size() - 1));
            li = li2;
            list.add( li2);
        }
        return list;
    }
}
