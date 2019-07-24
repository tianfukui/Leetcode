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
        //时间复杂度O(n^2),空间复杂度O(1)
        if(strs.length == 0) return "";
        String CommonPrefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(CommonPrefix) != 0){
                CommonPrefix = CommonPrefix.substring(0, CommonPrefix.length() - 1);
                if(CommonPrefix.length() == 0) return "";
            }
        }
        return CommonPrefix;
    }
}

