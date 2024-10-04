package PatternMatching;

public class Pattern20 {

    public static void printPattern(int n){

        for(int i=0;i<n;i++) {

            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            if(i==n-1){
                continue;
            }else {
                System.out.println();
            }
        }
        for(int i=n;i>=0;i--) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        printPattern(5);
    }
}
