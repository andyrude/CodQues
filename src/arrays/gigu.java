package arrays;

import java.util.Scanner;

public class gigu {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        long income = sc.nextLong();
        System.out.println( calculateIncomeTax( income));
    }

    public static Double calculateIncomeTax( long income){
        Double tax1 = 0.0;
        if( income <= 250000){
            tax1 = .05 * income;
        } else if ( income <= 500000) {
         tax1 = .1 * income;
        } else if ( income <= 750000) {
            tax1 = .15 * income;
        } else if ( income <= 100000) {
            tax1 = .2 * income;
        } else if (  income <= 1250000) {
            tax1 = .25 * income;
        } else if ( income <= 150000) {
            tax1 = .3 * income;
        }else if( income>= 150000){
                tax1 = .3 * income;
            if( income > 5000000){
                tax1+= .1 * tax1;
            } else if ( income > 10000000) {
                tax1+= .15 * tax1;
             } else if ( income > 20000000) {
                tax1+= .25 * tax1;
            }else if( income > 50000000){
                tax1 += .37 * tax1;
            }
        }
        System.out.println("");
        return tax1;
    }
}
