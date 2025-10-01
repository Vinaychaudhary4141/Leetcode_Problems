// Last updated: 10/1/2025, 3:18:21 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] countS1 = new int[26];
        int[] countWindow = new int[26];
        for (char c : s1.toCharArray()) {
            countS1[c - 'a']++;
        }
        int windowSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            countWindow[s2.charAt(i) - 'a']++;
            if (i >= windowSize) {
                countWindow[s2.charAt(i - windowSize) - 'a']--;
            }
            if (Arrays.equals(countS1, countWindow)) {
                return true;
            }
        }
        return false;
    }
}
