package PatternMatching;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args){

        System.out.print(" Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
