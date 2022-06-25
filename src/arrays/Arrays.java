package arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 1, 2, 1, 1};
        System.out.println( sol( a));
    }
    public static int sol( int[] a){
        int k = 0;
        for( int i = 0; i < a.length -2; i++){
            if ( (a[i] == a[i + 1] && a[i] != a[i + 2]) || ( a[i] != a[i + 1] && a[i] == a[i + 2]) || ((a[i]!= a[i + 1])&& (a[i + 1] == a[i + 2]))){
                k++;
                continue;
            }
        }
        return k;
    }
}
