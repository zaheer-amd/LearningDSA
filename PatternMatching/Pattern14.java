package PatternMatching;

public class Pattern14 {

    public static void printPattern(int n){

        for(int i=0;i<n;i++){
            char a='A';
            for (int j=0;j<=i;j++){

                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printPattern(6);
    }
}
