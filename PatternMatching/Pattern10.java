package PatternMatching;

public class Pattern10 {

    public static void patternPrint(int n){
        for( int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for( int i=n;i>1;i--){
            for(int j=i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        patternPrint(5);
    }

}
