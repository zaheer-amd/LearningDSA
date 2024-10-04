package PatternMatching;

public class Pattern17 {

    public static void printPattern(int n){

        for(int i=0;i<n;i++){
            for( int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            char a='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(a);
                if(j<=breakpoint) a++;
                else a--;
            }

            for( int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        printPattern(5);
    }
}
