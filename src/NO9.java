import java.util.Scanner;

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//Example 1:
//        Input: 121
//        Output: true
//Example 2:
//        Input: -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//        Input: 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
public class NO9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int initial_result = x;
        int reversed_result = 0;
        while(x != 0){
            int pop = x % 10;
            x = x / 10;
            reversed_result = reversed_result * 10 + pop;
        }
        if(initial_result == reversed_result) return true;
        else return false;
    }
}
