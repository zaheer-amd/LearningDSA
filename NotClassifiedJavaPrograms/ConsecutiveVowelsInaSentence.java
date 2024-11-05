package NotClassifiedJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveVowelsInaSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split("\\s+");
        System.out.println(Arrays.toString(arr));
        ArrayList<String> result = new ArrayList<>();

        for(String s : arr){
            int count = 0;
            char[] charArray = s.toCharArray();
            for(int i=0;i<charArray.length - 1; i++){
                char c = charArray[i];
                if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    char d = charArray[i + 1];
                    if( d=='a' || d=='e' || d=='i' || d=='o' || d=='u'){
                        result.add(s);
                    }
                }
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}
