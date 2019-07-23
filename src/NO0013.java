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
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV.
//Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//        Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
//Example 1:
//        Input: "III"
//        Output: 3
//Example 2:
//        Input: "IV"
//        Output: 4
//Example 3:
//        Input: "IX"
//        Output: 9
//Example 4:
//        Input: "LVIII"
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
//Example 5:
//        Input: "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
public class NO0013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(romanToInt(str));
    }
    public static int romanToInt(String s) {
        //时间复杂度O(n),空间复杂度O(1)
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == 'I') {res = res + 1; continue;}
            if(s.charAt(i) == 'V'){
                if((i - 1) >= 0) {
                    if (s.charAt(i - 1) != 'I') res = res + 5;
                    else {
                        res = res + 4;
                        i--;
                    }
                }
                else res = res + 5;
                continue;
            }
            if(s.charAt(i) == 'X'){
                if((i - 1) >= 0) {
                    if (s.charAt(i - 1) != 'I') res = res + 10;
                    else {
                        res = res + 9;
                        i--;
                    }
                }
                else res = res + 10;
                continue;
            }
            if(s.charAt(i) == 'L'){
                if((i - 1) >= 0) {
                    if (s.charAt(i - 1) != 'X') res = res + 50;
                    else {
                        res = res + 40;
                        i--;
                    }
                }
                else res = res + 50;
                continue;
            }
            if(s.charAt(i) == 'C'){
                if((i - 1) >= 0) {
                    if (s.charAt(i - 1) != 'X') res = res + 100;
                    else {
                        res = res + 90;
                        i--;
                    }
                }
                else res = res + 100;
                continue;
            }
            if(s.charAt(i) == 'D'){
                if((i - 1) >= 0) {
                    if (s.charAt(i - 1) != 'C') res = res + 500;
                    else {
                        res = res + 400;
                        i--;
                    }
                }
                else res = res + 500;
                continue;
            }
            if(s.charAt(i) == 'M'){
                if((i - 1) >= 0) {
                    if (s.charAt(i - 1) != 'C') res = res + 1000;
                    else {
                        res = res + 900;
                        i--;
                    }
                }
                else res = res + 1000;
                continue;
            }
        }
        return res;
    }
}
