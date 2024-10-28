package JavaCollectionsPractice;

import java.util.HashMap;

public class FrequencyCheck {
    public  static void main(String[] args){
        int[] input = new int[]{1, 2, 3, 4, 5, 4, 5, 2, 2, 3};

        System.out.println(countFrequency(input));
    }

    private static HashMap<Integer, Integer> countFrequency(int[] input) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: input){
            hashMap.put(i, hashMap.getOrDefault(i, 0) +1);
        }

        return hashMap;
    }
}
