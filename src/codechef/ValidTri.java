package codechef;

import java.util.EventListener;
import java.util.Scanner;

public class ValidTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++){
            sc.nextLine();
            int[] arr = new int[3];
            int c = 0;
            for ( int j = 0; j < 3; j++){
                c = c + sc.nextInt();
            }
            if ( c == 180){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
