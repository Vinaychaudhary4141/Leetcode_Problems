// Last updated: 9/24/2025, 3:47:37 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } else {
                map.put(c, word);
            }

            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != c) return false;
            } else {
                reverseMap.put(word, c);
            }
        }
        return true;
    }
}
