class Solution {
    public void moveZeroes(int[] nums) {
        // Yeh pointer track karega ki non-zero number kahan baithna chahiye
        int insertPos = 0;
        
        // Step 1: Poore array mein sirf non-zero elements ko dhoondho
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i]; // Non-zero ko aage shift kiya
                insertPos++; // Agli khali jagah ko aage badhayein
            }
        }
        
        // Step 2: Ab jitni bhi jagah aakhri mein bach gayi hai, wahan 0 bhar do
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}