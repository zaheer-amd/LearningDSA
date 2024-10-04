package PatternMatching;

public class Pattern13 {
    static int a;
    public static void printPattern(int n){

        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                a=a+1;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printPattern(6);
        }
}
