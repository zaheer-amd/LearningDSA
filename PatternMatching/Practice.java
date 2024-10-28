package PatternMatching;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {

        for(int i=0;i<n;i++){
            for(int j=n;j>i+1;j--){
                System.out.print("*");
            }

//            for(int j=0;j<=i*2;j++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }
}
