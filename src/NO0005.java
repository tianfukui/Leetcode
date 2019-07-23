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
    public static String longestPalindrome_Dynamic_Programming(String s) {
        //时间复杂度O(n^2),空间复杂度O(n)
        if(s == null || s.length() < 1) return "";
        String Palindrome = "";
        for(int i = 0; i < s.length(); i++){
            String ans1 = Dynamic_Programming(s,i,i);
            if(ans1.length() > Palindrome.length()){
                Palindrome = ans1;
            }
            String ans2 = Dynamic_Programming(s,i,i + 1);
            if(ans2.length() > Palindrome.length()){
                Palindrome = ans2;
            }
        }
        return Palindrome;
    }
    public static String Dynamic_Programming(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return s.substring(left + 1,right);
    }
    public static String longestPalindrome_Expand_Around_Center(String s) {
        if(s == null && s.length() < 1) return "";
        int start = 0, end  = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = Expand_Around_Center(s, i, i);
            int len2 = Expand_Around_Center(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end + 1);
    }
    public static int Expand_Around_Center(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input_string = input.nextLine();
        System.out.println("第一种方法:");
        System.out.println(longestPalindrome_Dynamic_Programming(input_string));
        System.out.println("第二种方法:");
        System.out.println(longestPalindrome_Expand_Around_Center(input_string));
    }
}
