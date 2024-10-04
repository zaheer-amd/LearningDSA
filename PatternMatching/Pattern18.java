package PatternMatching;

public class Pattern18 {

    public static void printPattern(int n){

        for(int i=0;i<n;i++){
            char a='A';
            a=(char)(a+(n-1));
            for( int j=0;j<=i;j++){
                System.out.print(a+" ");
                a= (char) (a-1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        printPattern(4);
    }
}
