class Solution {
    public boolean isPalindrome(String s) {
        // Do pointers banaye
        int left = 0;
        int right = s.length() - 1;
        
        // Loop tab tak chalega jab tak dono pointers beech mein nahi milte
        while (left < right) {
            
            // 1. Agar left pointer valid character par nahi hai, toh aage badho
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            // 2. Agar right pointer valid character par nahi hai, toh piche jao
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // 3. Ab dono valid jagah par hain, toh lowercase karke compare karo
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            
            if (leftChar != rightChar) {
                return false; // Agar alag hain toh palindrome nahi hai
            }
            
            // Agar same hain, toh pointers ko center ki taraf khiskao
            left++;
            right--;
        }
        
        // Agar poora check ho gaya bina kisi mismatch ke
        return true;
    }
}