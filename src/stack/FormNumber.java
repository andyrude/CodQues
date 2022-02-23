package stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FormNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            String p = sc.nextLine();
            String[] arr = p.split(" ");
            for (int i=0; i < n; i++){
                formingNumber(arr[i]);
            }
        }

        public static void formingNumber(String arr){
                int start = 1, pos= 0;
                ArrayList<Integer> al = new ArrayList<>();
                if (arr.charAt(0) == 'I') {
                    al.add(1);
                    al.add(2);
                    start = 3;
                    pos = 1;
                }
                else {
                    al.add(2);
                    al.add(1);
                    start = 3;
                    pos = 0;
                }
                for (int i = 1; i < arr.length(); i++) {
                    if (arr.charAt(i) == 'I') {
                        al.add(start);
                        start++;
                        pos = i + 1;
                    }
                    else {
                        al.add(al.get(i));
                        for (int j = pos; j <= i; j++)
                            al.set(j, al.get(j) + 1);
                        start++;
                    }
                }
                for (int i = 0; i < al.size(); i++)
                    System.out.print(al.get(i));
                System.out.println();
            }
}
