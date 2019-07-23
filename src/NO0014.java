import java.util.Scanner;

//Write a function to find the longest common prefix string amongst an array of strings.
//        If there is no common prefix, return an empty string "".
//Example 1:
//        Input: ["flower","flow","flight"]
//        Output: "fl"
//Example 2:
//        Input: ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
public class NO0014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[3];
        for(int i = 0; i < 3; i++){
            str[i] = input.nextLine();
        }
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i = 0; i < strs.length; i++){
            for(int j = 0;j < strs[i].length(); j++){
                int
            }
        }
        return res;
    }
}

