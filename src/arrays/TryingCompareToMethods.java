package arrays;

import java.util.Arrays;

public class TryingCompareToMethods{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(40, 30);
        Rectangle r3 = new Rectangle(20,25);
        Rectangle r2 = new Rectangle( 20, 25);
        Rectangle[] arr = new Rectangle[3];

        arr[0] = r1;
        arr[1] = r2;
        arr[2] = r3;
        for ( Rectangle r: arr) {
            System.out.println(r.getArea());
        }
        Arrays.sort(arr);
        for ( Rectangle r: arr) {
            System.out.println(r.getArea());
        }
    }
}
class Rectangle implements Comparable<Rectangle>{
    int length;
    int breadth;

    public int getArea( ){
        int i = length * breadth;
        return i;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int compareTo(Rectangle o) {
        if( this.getArea() > o.getArea()){
                return 1;
        }else{
            return -1;
        }
    }
}