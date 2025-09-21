// Last updated: 9/21/2025, 7:55:28 PM
class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                list.add(c);
            }
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                sb.append(list.get(idx++));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
