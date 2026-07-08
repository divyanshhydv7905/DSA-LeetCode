public class Solution {
    public int maxSubArray(int[] nums) {
        // Track the overall maximum sum found so far
        int maxSoFar = nums[0];
        // Track the maximum sum of the subarray ending at the current index
        int currentMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide to either extend the existing subarray or start a new one
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Update the global maximum if the current subarray sum is larger
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
  