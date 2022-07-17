package DPtabularForm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString( getSol( n)));
    }

    private static int[] getSol(int n) {
        if( n == 1){
            int[] arr = {1};
            return arr;
        }
        if( n == 2){
            int[] arr = {1,1};
            return arr;
        }
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        for(int i=2; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) arr[i][j]=1;
                else arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr[n - 1];
    }
}
