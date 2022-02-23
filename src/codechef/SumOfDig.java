package codechef;

import java.util.Scanner;

public class SumOfDig {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                int c = 0;
                for (int j = 0; j < str.length(); j++) {
                    int chr = Integer.parseInt(String.valueOf(str.charAt(j)));
                    c = c + chr;
                }
                System.out.println(c);
            }
        }
    }
