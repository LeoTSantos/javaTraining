package topic3.assignment4;

/**
 * Created by e083028 on 8/30/2018.
 */
public class Assignment4 {
    public static void main(String[] args) {
        String s = args[0];
        boolean isPalindrome = true;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        if(isPalindrome){
            System.out.print("Is a palindrome!");
        } else {
            System.out.print("Is not a palindrome.");
        }
    }
}
