class Solution {
    public int maxSubArray(int[] nums) {
        // Shuru mein maxSum ko sabse choti integer value de dete hain
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        // Array ke har element par loop chalayenge
        for (int i = 0; i < nums.length; i++) {
            // Current number ko sum mein jodo
            currentSum += nums[i];
            
            // Agar yeh ab tak ka sabse bada sum hai, toh maxSum ko update karo
            maxSum = Math.max(maxSum, currentSum);
            
            // AGAR CURRENT SUM NEGATIVE HO GAYA, TOH ISE CHHOD DO Aur 0 SE START KARO!
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}