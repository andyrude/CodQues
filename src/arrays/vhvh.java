package arrays;

import java.util.Scanner;

public class vhvh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int cost = 0;
        for(int i=0; i<n; i++){
            int temp = arr[i];
                boolean x = true;
                int count = 0;
                while (temp > 0) {
                    if (n % 2 == 0) {
                        x = false;
                        break;
                    }
                    n = n / 10;
                    count++;
                }

                if(x){
                    cost -= 1;
                }
                else{
                    cost = cost+count;
                }

            System.out.println(cost);
        }
    }
}
