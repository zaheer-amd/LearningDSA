package NotClassifiedJavaPrograms;

import java.util.Scanner;

public class CharRepeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        char temp = charArray[0];
        int count = 1;


        for(int i=1;i<charArray.length; i++){
            char c = charArray[i];
            if(c == temp){
                count ++;
            }else{
                sb.append(temp).append(count -1);
                temp = c;
                count = 1;
            }
        }
        sb.append(temp).append(count -1);
        System.out.println(sb);
    }
}
