import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II.
// The number twenty seven is written as XXVII, which is XX + V + II.
//Roman numerals are usually written largest to smallest from left to right.
// However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
//Example 1:
//    Input: 3
//    Output: "III"
//Example 2:
//    Input: 4
//    Output: "IV"
//Example 3:
//    Input: 9
//    Output: "IX"
//Example 4:
//    Input: 58
//    Output: "LVIII"
//    Explanation: L = 50, V = 5, III = 3.
//Example 5:
//    Input: 1994
//    Output: "MCMXCIV"
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
public class NO0012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        //时间复杂度O(n) 空间复杂度O(n)
        String ans = "";
        int single_digit = 0, ten_digit = 0, hundred_digit = 0, thousand_digit = 0;
        single_digit = num % 10;
        ten_digit = (num / 10) % 10;
        hundred_digit = (num / 100) % 10;
        thousand_digit = (num / 1000);
        if(thousand_digit != 0){
            for(int i = 0; i < thousand_digit; i++) ans = ans + "M";
        }
        if(hundred_digit != 0){
            if(hundred_digit > 0 && hundred_digit <= 4){
                if(hundred_digit == 4) ans = ans + "CD";
                else {
                    for (int i = 0; i < hundred_digit; i++) ans = ans + "C";
                }
            }
            else if(hundred_digit == 5){
                ans = ans + "D";
            }
            else if(hundred_digit > 5 && hundred_digit <= 9){
                if(hundred_digit == 9) ans = ans + "CM";
                else{
                    ans = ans + "D";
                    for(int i = 0; i < hundred_digit - 5; i++) ans =ans + "C";
                }
            }
        }
        if(ten_digit != 0){
            if(ten_digit > 0 && ten_digit <= 4){
                if(ten_digit == 4) ans = ans + "XL";
                else {
                    for (int i = 0; i < ten_digit; i++) ans = ans + "X";
                }
            }
            else if(ten_digit == 5){
                ans = ans + "L";
            }
            else if(ten_digit > 5 && ten_digit <= 9){
                if(ten_digit == 9) ans = ans + "XC";
                else{
                    ans = ans + "L";
                    for(int i = 0; i < ten_digit - 5; i++) ans =ans + "X";
                }
            }
        }
        if(single_digit != 0){
            if(single_digit > 0 && single_digit <= 4){
                if(single_digit == 4) ans = ans + "IV";
                else {
                    for (int i = 0; i < single_digit; i++) ans = ans + "I";
                }
            }
            else if(single_digit == 5){
                ans = ans + "V";
            }
            else if(single_digit > 5 && single_digit <= 9){
                if(single_digit == 9) ans = ans + "IX";
                else{
                    ans = ans + "V";
                    for(int i = 0; i < single_digit - 5; i++) ans =ans + "I";
                }
            }
        }
        return ans;
    }
}
