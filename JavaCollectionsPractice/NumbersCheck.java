package JavaCollectionsPractice;

class Numbers{

    // Given an Integer value, find out how many numbers are there.
    int countNumbers(int n){

        int count = 0;
        while(n>0) {
            n=n/10;
            count++;
        }
        System.out.println("The integer has " +count+" digits.");
        return count;
    }

    // Reverse the given number
    String reverseNumber(int n){
        int temp=0;
        StringBuilder reverse = new StringBuilder();

        while(n>0){
            temp=n%10;
            reverse.append(temp);
            n=n/10;
        }
        System.out.println("The reverse of given integer is "+reverse);
        return String.valueOf(reverse);
    }

    //Check if given integer palindrome
    void checkPalindrome(int n){
        String reverse = reverseNumber(n);
        if(reverse.equals(Integer.toString(n))){
            System.out.println("Its a palindrome!");
        } else {
            System.out.println("Its not a palindrome!");
        }
    }

    void checkArmstrongNumber(int n){

        int count = countNumbers(n);
        int temp;
        int before = n;
        int sum = 0;
        while(n>0){
            temp=n%10;
            sum= sum + ((int) Math.pow(temp, count));
            n=n/10;
        }
        if(sum==before){
            System.out.println("Its an Armstrong Number!");
        } else {
        System.out.println("Its not an Armstrong Number!");
        }
    }


}
public class NumbersCheck {
    public static void main(String[] args){

        Numbers obj1= new Numbers();
        obj1.countNumbers(54321);
        obj1.reverseNumber(54321);
        obj1.checkPalindrome(543456);
        obj1.checkArmstrongNumber(153);
    }
}
