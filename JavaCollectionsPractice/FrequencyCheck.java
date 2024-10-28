package JavaCollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCheck {
    public  static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] input = new int[]{1, 2, 3, 4, 5, 4, 5, 2, 2, 3};

        System.out.println(countFrequency(input));

        hashMap = countFrequency(input);

        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println("["+entry.getKey()+" "+ entry.getKey()+"]");
        }
    }

    private static HashMap<Integer, Integer> countFrequency(int[] input) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: input){
            hashMap.put(i, hashMap.getOrDefault(i, 0) +1);
        }

        return hashMap;
    }
}
