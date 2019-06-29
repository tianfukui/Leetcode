import java.util.Scanner;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Example 1:
//    Input: "babad"
//    Output: "bab"
//    Note: "aba" is also a valid answer.
//Example 2:
//    Input: "cbbd"
//    Output: "bb"
public class NO5 {
    public static String longestPalindrome(String s) {
        String ans;
        String reversed = "";
        int length = s.length();
        for(int i = length - 1;i >= 0; i--){
             = s.valueOf(length - i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input_string = input.nextLine();
        System.out.println(longestPalindrome(input_string));
    }
}
