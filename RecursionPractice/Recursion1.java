package RecursionPractice;

public class Recursion1 {
    public static void main(String[] args){
        recursiveMethod(5,0);
    }

    private static void recursiveMethod(int i, int n) {
        if( i==0) {
            System.out.println(n);
            return;
        } else {
            recursiveMethod(i-1,n+i);
        }
        System.out.println();
    }
}
