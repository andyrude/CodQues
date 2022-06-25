package arrays;

import java.util.Scanner;

public class CeipherChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String  str = sc.nextLine();
       int n = sc.nextInt();
        System.out.println(sol(str , n));
    }
     public static String  sol( String str, int n){
        String p = "";
        for( int i = 0; i < str.length(); i++){
          int k = (int)str.charAt(i);
          if (str.charAt(i) == ' '){
              p = p + " ";
          }
          else if( k >= 65 && k <=91){
              if( k + n > 91){
                  int m = 65 + (k + n) - 91;
                  char c = (char)m;
                  p = p + c;
                  continue;
              }else{
                  char c = (char) ((char)k+n);
                  p = p + c;
              }
          }else if( k >= 97 && k <=122){
              if( k + n > 122){
                  int m = 97 + (k + n) - 122;
                  char c = (char)m;
                  p = p + c;
                  continue;
              }else{
                  char c = (char) ((char)k+n);
                  p = p + c;
              }
          }

        }
        return p;
    }
}
