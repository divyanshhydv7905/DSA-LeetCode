class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int[26];
        int left=0;
        int maxlength=0;
        int maxCount=0;
        for (int right =0; right< s.length();right++){
            int charIndex= s.charAt(right)-'A';
            count[charIndex]++;
            maxCount= Math.max(maxCount,count[charIndex]);
            while ((right-left+1)-maxCount>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength, right-left+1);

        }
        
        return maxlength;
    }
}