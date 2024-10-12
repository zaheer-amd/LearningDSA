package SortingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(54, 20, 10, 64, 21, 14, 10, 3));
        System.out.println(sortedList(list));
    }

    private static List<Integer> sortedList(List<Integer> list) {
        int n= list.size();
       // System.out.println(n);
        for( int i=0; i<n-1; i++ ){
            for( int j=0;j<n-i-1;j++ ){
                if(list.get(j) > list.get(j + 1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }
}
