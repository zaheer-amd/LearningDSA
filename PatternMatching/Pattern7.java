package PatternMatching;

public class Pattern7 {

    public static void patternMethod (int n){
        for( int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args){
        patternMethod(5);
    }
}