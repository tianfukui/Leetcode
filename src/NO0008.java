import java.util.Scanner;

//Example 1:
//        Input: "42"
//        Output: 42
//Example 2:
//        Input: "   -42"
//        Output: -42
//        Explanation: The first non-whitespace character is '-', which is the minus sign.
//        Then take as many numerical digits as possible, which gets 42.
//Example 3:
//        Input: "4193 with words"
//        Output: 4193
//        Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
//Example 4:
//        Input: "words and 987"
//        Output: 0
//        Explanation: The first non-whitespace character is 'w', which is not a numerical
//        digit or a +/- sign. Therefore no valid conversion could be performed.
//Example 5:
//        Input: "-91283472332"
//        Output: -2147483648
//        Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
//        Thefore INT_MIN (−231) is returned.
public class NO0008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String str) {
        long result = 0;
        char c = ' ';
        int i;
        boolean flag = false;
        for(i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if(c != ' '){
                if(c == '-'){
                    flag = true;
                    i++;
                }
                if(c == '+'){
                    flag = false;
                    i++;
                }
                break;
            }
        }
        for(;i < str.length(); i++){
            c = str.charAt(i);
            if(Character.isDigit(c)){
                result = result * 10 + Character.getNumericValue(c);
            }
            else break;
            if(result > Integer.MAX_VALUE){
                if(flag) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }
        }
        if(flag) result = - result;
        return (int)result;
    }
}