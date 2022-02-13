package Adobe.ArraysStrings;
//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
// n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
// Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
public class ContainerWithMostWater {

    // brute force O(n^2)
    public int maxArea2(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++){

            for( int j = i + 1; j < height.length; j++){
                int len = Math.min(height[i],height[j]);
                int width = j - i;
                int area = len * width;
                if( area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
    }

    // second approach, O(n)
    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0, right = height.length - 1;
        while (left < right){
            int len = Math.min(height[left], height[right]);
            int width = right - left;
            maxarea = Math.max(maxarea, len * width);
            if( height[left] < height[right])
                left++;
            else right--;
        }
        return maxarea;

    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};        //4,3,2,1,4
        int[] arr2 = {4,3,2,1,4};
        ContainerWithMostWater mostWater = new ContainerWithMostWater();
        System.out.println(mostWater.maxArea(arr2));
    }

}
