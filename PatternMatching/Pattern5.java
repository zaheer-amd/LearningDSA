package PatternMatching;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args){

        System.out.print(" Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
