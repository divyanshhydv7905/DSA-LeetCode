class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            // Choti height container ki height decide karegi
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            
            // Current area calculate karke maxWater update karo
            int currentWater = h * width;
            maxWater = Math.max(maxWater, currentWater);
            
            // Jo line choti hai, use badhao/ghatao
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}