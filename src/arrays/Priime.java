package arrays;

import java.util.Scanner;

public class Priime {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        find( n, x , y , "");
        System.out.println(count);
    }

    private static void find(int n, int x, int y, String s) {
        if( y == 0 && x == 0 && n == 0){
            count++;
            System.out.println( s);
            return;
        }
        if( n == 0){
            return ;
        }
        find( n - 1, x , y , s + "1");
        find( n - 1, x , y - 1, s + "2");
        find( n - 1, x - 1, y - 1, s + "3");
        find( n - 1, x , y, s + "4");
        find( n - 1, x - 1, y - 1, s + "5");
        find( n - 1, x, y, s + "6");
    }
}
