import java.util.HashMap;
import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//        An input string is valid if:
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
//Example 1:
//        Input: "()"
//        Output: true
//Example 2:
//        Input: "()[]{}"
//        Output: true
//Example 3:
//        Input: "(]"
//        Output: false
//Example 4:
//        Input: "([)]"
//        Output: false
//Example 5:
//        Input: "{[]}"
//        Output: true
public class NO0020 {
    public boolean isValid(String s) {
        HashMap<Character, Character> maptable = new HashMap<Character, Character>();
        maptable.put('(', ')');
        maptable.put('[', ']');
        maptable.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(maptable.containsKey(c)){
                if(stack.empty() || stack.pop() != maptable.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
