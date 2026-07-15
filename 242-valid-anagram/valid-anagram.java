class Solution {
    public boolean isAnagram(String s, String t) {
        // Edge Case: Agar length hi barabar nahi hai, toh anagram ho hi nahi sakte
        if (s.length() != t.length()) {
            return false;
        }
        
        // 26 alphabets ke liye frequency array banaya
        int[] count = new int[26];
        
        // Loop se s ke characters ka count badhao aur t ke characters ka ghatao
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // s ka character mila -> +1
            count[t.charAt(i) - 'a']--; // t ka character mila -> -1
        }
        
        // Ab check karo ki kya saare dabbe wapas 0 ho gaye?
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false; // Agar koi bhi bucket 0 nahi hai, toh false
            }
        }
        
        return true;
    }
}