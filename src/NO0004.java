//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//You may assume nums1 and nums2 cannot be both empty.
//Example 1:
//    nums1 = [1, 3]
//    nums2 = [2]
//    The median is 2.0
//Example 2:
//    nums1 = [1, 2]
//    nums2 = [3, 4]
//    The median is (2 + 3)/2 = 2.5
public class NO0004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //时间复杂度O(n+m),空间复杂度O(n+m)
        double median = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length_sum = length1 + length2;
        int nums[] = new int[length_sum];
        int index1 = 0,index2 = 0;
        for(int i = 0;i < length_sum; i++){
            if(index1 == nums1.length){
                nums[i] = nums2[index2];
                index2 ++;
            }
            else if(index2 == nums2.length){
                nums[i] = nums1[index1];
                index1 ++;
            }
            else if(nums1[index1] > nums2[index2]){
                nums[i] = nums2[index2];
                index2 ++;
            }
            else{
                nums[i] = nums1[index1];
                index1 ++;
            }
        }
        if(length_sum % 2 != 0 ){
            median = nums[length_sum / 2];
        }
        else{
            median = (nums[length_sum / 2 - 1] + nums[length_sum / 2]) / 2.0;
        }
        return median;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{},new int[]{3,4}));
    }
}
