package februaryLong;

import java.util.Scanner;

public class BinaryBaseBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i < n; i++){
            int m = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String p = sc.nextLine();
            int count = 0;
            for ( int l = 1; l <= p.length()/2; l++){
                    if( p.charAt(l-1) != p.charAt(p.length() - l) ){
                        count++;
                    }
            }
        }
    }
}
