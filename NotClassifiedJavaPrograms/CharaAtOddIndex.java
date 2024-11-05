package NotClassifiedJavaPrograms;

import java.util.Scanner;
public class CharaAtOddIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< arr.length; i++){
            if( i%2 !=0){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }

}
