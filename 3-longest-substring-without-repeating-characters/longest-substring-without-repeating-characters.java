class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        
        // ASCII characters (0-127) ka last seen index track karne ke liye
        int[] lastSeen = new int[128];
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // Agar ye character pehle dekha ja chuka hai, toh left ko direct jump karao
            // lastSeen[currentChar] hum 1-indexed store karenge taaki default 0 se clash na ho
            left = Math.max(left, lastSeen[currentChar]);
            
            // Current window size update karo
            maxLength = Math.max(maxLength, right - left + 1);
            
            // Current character ka index store karo (1-based for next jump position)
            lastSeen[currentChar] = right + 1;
        }
        
        return maxLength;
    }
}