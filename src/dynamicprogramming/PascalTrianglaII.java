package dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class PascalTrianglaII {

    public static List<Integer> getRow( int N){
        if(N==0) return Arrays.asList(1);
        int dp[][] = new int[N+1][N+1];
        dp[0][0]=1;
        dp[1][0]=dp[1][1]=1;
        for(int i=2; i<=N; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) dp[i][j]=1;
                else dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        return Arrays.stream(dp[N]).boxed().toList();
    }

    public static void main(String[] args) {

    }
}
