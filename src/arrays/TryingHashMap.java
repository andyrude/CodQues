package arrays;

import java.util.*;

public class TryingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        HashMap<String, Integer> hashmap = new HashMap<>();
        for( int  i = 0; i < str.length; i++){
            if(!hashmap.containsKey(str[i])){
                hashmap.put(str[i], 1);
            }else {
                int k = hashmap.get(str[i]);
                k++;
                hashmap.replace(str[i], k);
            }
        }
        hashmap.remove("");
        System.out.println(hashmap);
        ArrayList<String> arr = new ArrayList<>(hashmap.keySet());
        Collections.sort(arr);
        for( int i = 0; i < arr.size(); i++){
            if(hashmap.get(arr.get(i))%2 == 1){
                System.out.println(arr.get(i) + " ");
            }
        }
    }
}
