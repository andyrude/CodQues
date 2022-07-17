package dynamicprogramming;

import java.util.Scanner;
import java.util.stream.Stream;

public class BTTBSS {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String[] str = sc.nextLine().split(" ");
        System.out.println( getBTTBSSII( Stream.of(str).mapToInt(Integer::parseInt).toArray()));
    }

    private static int getBTTBSS(int[] toArray) {
        int l = Integer.MAX_VALUE;
        int p = 0;
        for( int i = 0; i < toArray.length; i++){
            if( toArray[i] < l){
                l = toArray[i];
            }
            if( p < toArray[i] - l){
                p = toArray[i] - l;
            }
        }
        return p;
    }

    private static int getBTTBSSII( int[] prices){

        int profit = 0;

        for(int i = 1; i < prices.length; i++){

            if(prices.length == 1) return 0;

            if( prices[i] > prices[i - 1]){
                profit += (prices[i] - prices[i - 1]);
            }
            System.out.println(profit);
        }
        return profit;
    }
}
