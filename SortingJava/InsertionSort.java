package SortingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(54, 20, 10, 64, 21, 14, 10, 3, 42, 12));

        System.out.println(sortingMethod(list));
    }

    private static List<Integer> sortingMethod(List<Integer> list) {

        int n = list.size();
        for( int i=0; i<n; i++){
            int j=i;
            while(j>0 && list.get(j)<list.get(j-1)) {
                int temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j--;
            }
        }

        return list;
    }
}
