package NotClassifiedJavaPrograms;

// Count frequency of each element in the array

import java.util.*;

public class CountFrequencyandFindMinorMax {

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

            int Max=Integer.MIN_VALUE;
            int Min=Integer.MAX_VALUE;
            int answer=0;
            int answer1=0;

            for(Map.Entry<Integer, Integer> entry : hashmap.entrySet()){
                if(entry.getValue() < Min){
                    Min = entry.getValue();
                    answer = entry.getKey();
                }

                if(entry.getValue() > Max){
                    Max = entry.getValue();
                    answer1 = entry.getKey();
                }


            }
            System.out.println("The Min Frequency character is " + answer);
            System.out.println("The Max Frequency character is " + answer1);

    }
    public static void main(String[] args){
        List<Integer> arr1 = new ArrayList<>(Arrays.asList( 5, 5, 1, 2, 3, 4, 4, 5, 5, 6));
        bruteForce(arr1);
    }
}
