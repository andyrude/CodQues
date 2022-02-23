package februaryLong;

import java.util.Scanner;

public class ChefAndHairSalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int l = 0;
        for ( int i = 0; i < n; i++){
            sc.nextLine();
             k = sc.nextInt();
             l = sc.nextInt();
            System.out.println(k * l);
        }
    }
}
