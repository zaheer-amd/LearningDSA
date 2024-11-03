package NotClassifiedJavaPrograms;

import java.util.Arrays;

public class InPlaceSwapping {
    public static void main(String[] args){
        int[] nums= new int[]{ 5, 4, 3, 4, 6, 7, 8, 5, 9, 7, 5, 5, 5};
        int val = 5;
        int n= nums.length;

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if( nums[i] == val) {
                int j=nums.length -1;
                while(j >i){
                    if( nums[j] == val) { j--; continue; }
                    int temp= nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    count++;
                    break;
                }
            } else {
                count++;
            }
        }
        System.out.print(count+", nums = "+Arrays.toString(nums));
    }

}
