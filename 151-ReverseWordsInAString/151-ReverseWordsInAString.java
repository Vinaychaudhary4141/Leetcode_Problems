// Last updated: 8/1/2025, 11:56:51 AM
public class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim and split the string by spaces, ignoring multiple spaces
        String[] words = s.trim().split("\\s+");

        // Step 2: Reverse the words in the array
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Step 3: Join the words with a single space and return the result
        return String.join(" ", words);
    }
}
