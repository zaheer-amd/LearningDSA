package NotClassifiedJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
//        int[] inputArray = String.valueOf(input).chars().map(Character::getNumericValue).toArray();
//        int maximum = Arrays.stream(inputArray).max().getAsInt();

        boolean result = isArmstrong(input);
        System.out.println(result);
    }

    public static boolean isArmstrong( int input){

        int total = 0;
        int[] number = String.valueOf(input).chars().map(Character::getNumericValue).toArray();

        for(int i=0;i<number.length;i++){
            total += (int)Math.pow(number[i],number.length);

        }

        return (total == input);
    }
}
