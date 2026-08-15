class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        // Pehle k elements ka sum (Primitive int)
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        
        // Window slide karo
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        
        // Sirf aakhri mein 1 baar double conversion
        return (double) maxSum / k;
    }
}