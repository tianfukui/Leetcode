import java.util.Scanner;

//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Example 1:
//    Input: "babad"
//    Output: "bab"
//    Note: "aba" is also a valid answer.
//Example 2:
//    Input: "cbbd"
//    Output: "bb"
public class NO0005 {
    public static String longestPalindrome(String s) {
        String ans = "";
        int length = s.length();
        for(int i = 0; i < length -1; i++){

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input_string = input.nextLine();
        System.out.println(longestPalindrome(input_string));
    }
}
