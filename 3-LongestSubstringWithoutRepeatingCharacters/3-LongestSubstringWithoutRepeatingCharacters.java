// Last updated: 8/1/2025, 11:58:05 AM
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0; // Left pointer for the sliding window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the substring, move the left pointer
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1; // Move left pointer to the right of the last occurrence
            }

            // Update the last index of the character
            charIndexMap.put(currentChar, right);
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
