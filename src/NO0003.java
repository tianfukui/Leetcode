import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given a string, find the length of the longest substring without repeating characters.
//Example 1:
//    Input: "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
//Example 2:
//    Input: "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.
//Example 3:
//    Input: "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class NO0003 {
    public static int lengthOfLongestSubstring1(String s) {
        if(s == null || s.length() == 0) return 0;
        int n = s.length();
        int maxlength = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(IsDuplicate(s, i ,j)) maxlength = Math.max(maxlength,j - i);
            }
        }
        return maxlength;
    }
    public static boolean IsDuplicate(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for(int i = start; i < end; i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    public static int lengthOfLongestSubstring2(String s){
        if(s == null || s.length() == 0) return 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxlength = 0, i = 0, j = 0;
        while(i < n && j < n){
            Character ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(s.charAt(j++));
                maxlength = Math.max(maxlength,j - i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return maxlength;
    }
//    public static int lengthOfLongestSubstring3(String s){
//        if(s == null || s.length() == 0) return 0;
//        int maxlength = 0;
//        int n = s.length();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0, j = 0; j < n; j++){
//            if(!map.containsKey(s.charAt(j))){
//                map.put(s.charAt(j),j);
//                maxlength = Math.max(maxlength,j - i);
//            }
//            else {
//                i = Math.max(map.get(s.charAt(j)) + 1,i);
//            }
//        }
//        return maxlength;
//    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String input_String = input.nextLine();
        System.out.println("第一种方法;");
        int ans1 = lengthOfLongestSubstring1(input_String);
        System.out.println(ans1);
        System.out.println("第二种方法:");
        int ans2 = lengthOfLongestSubstring2(input_String);
        System.out.println(ans2);
        System.out.println("第三种方法:");
        int ans3 = lengthOfLongestSubstring1(input_String);
        System.out.println(ans3);
    }
}