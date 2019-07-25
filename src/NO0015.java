import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
//Find all unique triplets in the array which gives the sum of zero.
//Note:
//        The solution set must not contain duplicate triplets.
//Example:
//        Given array nums = [-1, 0, 1, 2, -1, -4],
//        A solution set is:
//        [
//        [-1, 0, 1],
//        [-1, -1, 2]
//        ]
public class NO0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        //时间复杂度O(n^2),空间复杂度O(1)
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3) return list;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++){
            while(i - 1 >= 0 && i < len && nums[i - 1] == nums[i]) i++;
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while(left < right && nums[left - 1] == nums[left]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}
