package arrays;

public class SumOfArrayOfZeros {

    public static void main(String[] args) {
        int[] arr = {0,0,0,6,0,0};
        System.out.println( find( arr));
    }

    private static int find(int[] arr) {
        int count = 0;
        int c = 0;
        int check = 0;
        for ( int i = 0; i < arr.length; i++){
            if ( arr[i] == 0){
                c++;
                check = check + c;
            }else {
                c = 0;
            }
        }
        return check;
    }
}
