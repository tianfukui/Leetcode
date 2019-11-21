import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO0078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null && nums.length == 0) return ans;
        helper(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    public static void helper(List<List<Integer>> ans, List<Integer> list, int[] nums, int start){
        ans.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            helper(ans, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
