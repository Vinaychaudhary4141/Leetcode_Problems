// Last updated: 9/21/2025, 7:54:52 PM
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int maxVowel = 0, maxConsonant = 0;
        String vowels = "aeiou";
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if (vowels.indexOf(ch) != -1) {
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxConsonant = Math.max(maxConsonant, count);
            }
        }
        return maxVowel + maxConsonant;
    }
}
