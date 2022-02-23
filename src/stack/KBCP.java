package stack;

import java.util.Scanner;

public class KBCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i < n; i++){
            sc.nextLine();
            for (int j=0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        celebrityProblem( arr, n);
    }

    private static void celebrityProblem(int[][] arr, int n) {
        int k = 0;
        for (int i=0; i < n; i++){
            for (int j=0; j < n; j++){
                if(i==j){
                    continue;
                }else if( arr[j][i] == 0){
                    break;
                }else {
                    k++;
                }
            }
            if(k==n-1){
                System.out.println(i);
                break;
            }
        }
        if(k!=n-1){
            System.out.println("No Celebrity");
        }
    }
}
