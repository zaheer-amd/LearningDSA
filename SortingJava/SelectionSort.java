package SortingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Sorting through the array with two loops
// 1. Outer loop loops through the array elements and decreases the starting point by 1 each time.
// 2. The inner loop finds the min element and swaps with the first element in the list
//
// for( i=0 to list.size() )
//      for ( j=i to list.size() )
//              if ( list[j] < min )
//                  swap list[i] min

public class SelectionSort {

    private static List<Integer> sortingMethod(List<Integer> list) {
        //int index = 0;
        for( int i=0; i<list.size() - 1; i++){
            int minIndex = i;
            for( int j=i+1; j<list.size(); j++){
                if(list.get(j)<list.get(minIndex)){
                    minIndex = j;
                }
            }
            System.out.println(minIndex + " " + list.get(minIndex));
            if( minIndex!=i) {
                int temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
        return list;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList( 5, 4, 6, 3, 8, 9, 7, 1, 2, 50, 42, 12));

        System.out.println(sortingMethod(list));
    }
}
