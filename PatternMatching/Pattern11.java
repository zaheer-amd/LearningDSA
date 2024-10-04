package PatternMatching;

public class Pattern11 {

    public static void printPattern(int N){
        System.out.println("The given input is : " + N);

        int toggle;

        for(int i=0;i<N;i++){
            if(i%2==0) toggle=1;
            else toggle=0;

            for (int j=0;j<=i;j++){
                System.out.print(toggle);
                toggle=1-toggle;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printPattern(5);
    }
}
