package NotClassifiedJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int[] array = {5, 0, 10, 14, 0, 12, 6, 0, 9, 0};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    public static void moveZeroes(int[] array){

        int nonZeroIndex = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }
        while(nonZeroIndex<array.length){
            array[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
