package codechef;

import java.util.Scanner;

public class SFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for ( int i = 0; i < n; i++){
            int k = 1;
            int po = sc.nextInt();
            sc.nextLine();
            for ( int j = 1; j <= po; j++){
                k = k * j;
            }
            System.out.println(k);
        }
    }
}
