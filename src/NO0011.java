import java.util.Scanner;

//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
//        Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//        Note: You may not slant the container and n is at least 2.
public class NO0011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[10];
        for(int i = 0; i < 10; i++){
            x[i] = input.nextInt();
        }
        System.out.println(maxArea_Brute_Force(x));
        System.out.println(maxArea(x));
    }
    public static int maxArea(int[] height){
        //时间复杂度O(n) 空间复杂度O(1)
        int area = 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            area = Math.max(area,Math.min(height[left],height[right]) * (right - left));
            if(height[left] < height[right]) left++;
            else right--;
        }
        return area;
    }
    public static int maxArea_Brute_Force(int[] height) {
        //时间复杂度O(n^2),空间复杂度O(1)
        int area = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j ++){
                area = Math.max(area,Math.min(height[i],height[j]) * (j - i));
            }
        }
        return area;
    }
}
