import java.util.Arrays;

//Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
//Return the sum of the three integers. You may assume that each input would have exactly one solution.
//        Example:
//        Given array nums = [-1, 2, 1, -4], and target = 1.
//        The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
public class NO0016 {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int res = 0, mindistence = 1000;
        for(int i = 0; i < len - 2; i++){
            while(i - 1 > 0 && i < len && nums[i - 1] == nums[i]) i++;
            int left = i + 1, right = len - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int distence = Math.abs(target - sum);
                if(distence < mindistence){
                    mindistence = distence;
                    res = sum;
                }
                if(target == sum) return sum;
                else if(sum < target) left++;
                else right--;
            }
        }
        return res;
    }
}
