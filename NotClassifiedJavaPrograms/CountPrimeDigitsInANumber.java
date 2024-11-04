package NotClassifiedJavaPrograms;

import java.util.Scanner;

public class CountPrimeDigitsInANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digit = Integer.parseInt(sc.nextLine());
        int[] arr = String.valueOf(digit).chars().map(Character::getNumericValue).toArray();
        int count =0;
        for(int i: arr){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){

        if( n < 2 ){
            return false;
        }

        for( int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
