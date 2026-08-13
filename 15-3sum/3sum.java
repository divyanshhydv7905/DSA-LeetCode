import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { // Ignore - standard class wrapper
        return null;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        // Step 1: Array ko sort karo
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 2; i++) {
            // Duplicate fixed element (i) ko skip karo
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Optimization: Agar pehla element hi positive ho gaya, 
            // toh aage teen positive numbers ka sum kabhi 0 nahi ho sakta!
            if (nums[i] > 0) {
                break;
            }
            
            int left = i + 1;
            int right = n - 1;
            int target = -nums[i]; // Kyunki nums[left] + nums[right] = -nums[i] hona chahiye
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    // Triplet mil gaya!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Left pointer ke duplicates skip karo
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Right pointer ke duplicates skip karo
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Pointers ko aage badhao
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Sum bada chahiye
                } else {
                    right--; // Sum chota chahiye
                }
            }
        }
        
        return result;
    }
}