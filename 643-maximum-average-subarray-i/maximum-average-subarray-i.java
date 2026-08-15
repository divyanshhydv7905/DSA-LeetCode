class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Pehli k size ki window ka sum nikaalo
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        double maxSum = currentSum;
        
        // Step 2: Window ko aage slide karte jao
        for (int i = k; i < nums.length; i++) {
            // Naya element add karo aur piche wala element hatao
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Step 3: Maximum sum ka average return karo
        return maxSum / k;
    }
}