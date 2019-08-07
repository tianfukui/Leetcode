import java.util.ArrayList;
import java.util.List;

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
