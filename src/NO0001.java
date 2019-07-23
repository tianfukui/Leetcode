//Two Sum
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example:
//        Given nums = [2, 7, 11, 15], target = 9,
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].
import java.util.HashMap;
import java.util.Scanner;

public class NO0001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target;
        target = input.nextInt();
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }
        int[] ans = new int[]{-1,-1};
        ans = twoSum(nums,target);
        System.out.println(ans);
    }
    //complement the algorithm
    public static int[] twoSum(int[] nums,int target){
        //时间复杂度O(n),空间复杂度O(n)
        int[] ans = new int[]{-1,-1};
        if(nums == null || nums.length < 2) return ans;
        HashMap<Integer,Integer> map = new HashMap(); //hashmap 键对值
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
