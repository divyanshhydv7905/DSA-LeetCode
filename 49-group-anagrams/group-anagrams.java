import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Agar array khali hai, toh empty list return karo
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // Key: Sorted String (e.g. "aet")
        // Value: List of original Anagrams (e.g. ["eat", "tea", "ate"])
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. String ko character array mein badalo aur sort karo
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            
            // 2. Sorted character array ko wapas String (Key) banao
            String sortedKey = String.valueOf(charArray);
            
            // 3. Agar key map mein nahi hai, toh nayi ArrayList bana do
            map.putIfAbsent(sortedKey, new ArrayList<>());
            
            // 4. Asli word ko us Key ki list mein add kar do
            map.get(sortedKey).add(s);
        }
        
        // HashMap ki saari lists ko combine karke return kar do
        return new ArrayList<>(map.values());
    }
}