// Last updated: 8/1/2025, 11:57:34 AM
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : strs) {
            // Sort the string to get the key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the list for this sorted key
            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(strs1));
        // Expected output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

        String[] strs2 = {""};
        System.out.println(solution.groupAnagrams(strs2));
        // Expected output: [[""]]

        String[] strs3 = {"a"};
        System.out.println(solution.groupAnagrams(strs3));
        // Expected output: [["a"]]
    }
}
