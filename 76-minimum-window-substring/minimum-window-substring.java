class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        int count = 0; 
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            if (need[rightChar] > 0) {
                count++;
            }
    
            need[rightChar]--;

            while (count == t.length()) {
               
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;

               
                if (need[leftChar] > 0) {
                    count--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}