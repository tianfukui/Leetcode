import java.util.ArrayList;
import java.util.List;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//        For example, given n = 3, a solution set is:
//        [
//        "((()))",
//        "(()())",
//        "(())()",
//        "()(())",
//        "()()()"
//        ]
public class NO0022 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"", 0 ,0, n);
        return ans;
    }
    public void helper(List<String> ans, String current, int left, int right, int n){
        if(current.length() == 2 * n){
            ans.add(current);
            return;
        }
        if(left < n){
            helper(ans, current + '(', left + 1, right, n);
        }
        if(right < left){
            helper(ans, current + ')', left, right + 1, n);
        }
    }
}
