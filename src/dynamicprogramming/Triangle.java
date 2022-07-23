package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Triangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add( 2);
        list.add( li);
        li = new ArrayList<>();
        li.add( 3);
        li.add(4);
        list.add( li);
        li = new ArrayList<>();
        li.add(6);
        li.add( 5);
        li.add(7);
        list.add( li);
        li = new ArrayList<>();
        li.add(4);
        li.add( 1);
        li.add( 8);
        li.add( 3);
        list.add( li);
        System.out.println( list);
        getsol( list);
    }

    private static int getsol(List<List<Integer>> list) {
        int[][] arr = new int[ list.size()][ list.get( list.size() - 1).size()];
        for( int i = 0; i < list.size() - 1; i++){
            Arrays.fill( arr[i], Integer.MAX_VALUE);
        }
        System.out.println( Integer.MAX_VALUE);
        arr[0][0] = list.get(0).get(0);
        for( int i = 0; i < list.size() - 1; i++){
            for( int j = 0; j <= i; j++){
                arr[i+1][j+1] += Math.min( arr[i+1][j+1], list.get(i).get(j) + arr[i][j]);
                arr[i+1][j] += Math.min( arr[i+1][j], list.get(i).get(j) + arr[i][j]);
            }
        }
        System.out.println(Arrays.toString(arr[list.size() - 1]));
        return 1;
    }
}
