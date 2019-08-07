import java.util.ArrayList;
import java.util.List;

//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
//A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//Example:
//        Input: "23"
//        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

public class NO0017 {
    private final String[] pad = {
            "","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits){
        List<String> ret = new ArrayList<>();
        int length = digits.length();
        if(length == 0) return ret;
        else if(length == 1){
            for(char c:pad[Integer.parseInt(digits.charAt(0) + "")].toCharArray()){
                ret.add("" + c);
            }
        }
        else{
            List<String> temp = new ArrayList<>();
            temp.addAll(letterCombinations(digits.substring(1)));
            for(String s:temp){
                for(char c:pad[Integer.parseInt(digits.charAt(0) + "")].toCharArray()){
                    ret.add(c + s);
                }
            }
        }
        return ret;
    }
}