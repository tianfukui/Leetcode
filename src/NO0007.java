import java.util.Scanner;

//Given a 32-bit signed integer, reverse digits of an integer.
//Example 1:
//        Input: 123
//        Output: 321
//Example 2:
//        Input: -123
//        Output: -321
//Example 3:
//        Input: 120
//        Output: 21
public class NO0007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(reverse(num));
    }
    public static int reverse(int x) {
        //时间复杂度0(n),空间复杂度O(1)
        int result = 0;
        while (x != 0){
            int single_digit = 0;
            single_digit = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && single_digit > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && single_digit < -8)) return 0;
            result = result * 10 + single_digit;
        }
        return result;
    }

}
