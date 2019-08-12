//Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
//        Return the quotient after dividing dividend by divisor.
//        The integer division should truncate toward zero.
//Example 1:
//        Input: dividend = 10, divisor = 3
//        Output: 3
//Example 2:
//        Input: dividend = 7, divisor = -3
//        Output: -2
public class NO0029 {
    public int divide(int dividend, int divisor){
        int sign = 1;
        int res = -1;
        if(dividend>0&&divisor<0||dividend<0&&divisor>0){
            sign = -1;
        }
        dividend = dividend>0?(0-dividend) : dividend;
        divisor = divisor>0?(0-divisor) : divisor;
        int orign_dividend = dividend;
        int orign_divisor = divisor;
        if(dividend > divisor)
            return 0;
        dividend -= divisor;
        while(dividend <= divisor){
            res += res;
            divisor += divisor;
            dividend -= divisor;
        }
        res = res + 0 - divide(orign_dividend - divisor,orign_divisor);
        if(res == Integer.MIN_VALUE){
            if(sign == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        return sign > 0 ? (0 - res) : res;
    }
}
