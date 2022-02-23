package codechef;

import java.util.Scanner;

public class Marbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = a - b;
        long ans = 1;
        if( c == 0){
            System.out.println("1");
            return;
        }else{
            System.out.println(c);
            for( int i = 1; i < b; i++){
                ans = ans * (c + i)/i;
            }
        }
        System.out.println(ans);
    }
}
