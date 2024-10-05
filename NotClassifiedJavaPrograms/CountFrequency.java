package NotClassifiedJavaPrograms;

// Count frequency of each element in the array

import java.util.*;

public class CountFrequency {

    static void bruteForce(List<Integer> arr1){
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(Integer num : arr1){
            if(hashmap.containsKey(num)){
                hashmap.put(num,hashmap.get(num)+1);
            } else {
                hashmap.put(num,1);
            }
        }
        System.out.println(("The frequency of each character is (Character=Frequency) : " + hashmap));
    }
    public static void main(String[] args){
        List<Integer> arr1 = new ArrayList<>(Arrays.asList( 5, 5, 1, 2, 3, 4, 4, 5, 5, 6));
        bruteForce(arr1);
    }
}
