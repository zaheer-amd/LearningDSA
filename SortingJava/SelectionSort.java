package SortingJava;

// Sorting through the array with two loops
// 1. Outer loop loops through the array elements and decreases the starting point by 1 each time.
// 2. The inner loop finds the min element and stores it in a variable which is compared for each loop.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList( 5, 4, 6, 3, 8, 9, 7, 1, 2));
        int result = sortingMethod(list);
        System.out.println(result);
    }

    private static int sortingMethod(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for( int i=0; i<list.size(); i++){
            for(int j=0;j<list.size();j++){
                if(list.get(j)<min){
                    min=list.get(j);
                }
            }
        }
        return min;
    }
}
