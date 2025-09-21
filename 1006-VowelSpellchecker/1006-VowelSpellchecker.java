// Last updated: 9/21/2025, 7:56:07 PM
import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelInsensitiveMap = new HashMap<>();
        
        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseInsensitiveMap.putIfAbsent(lower, word);
            vowelInsensitiveMap.putIfAbsent(devowel(lower), word);
        }
        
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactWords.contains(query)) {
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (caseInsensitiveMap.containsKey(lower)) {
                    result[i] = caseInsensitiveMap.get(lower); 
                } else {
                    String devowelQuery = devowel(lower);
                    if (vowelInsensitiveMap.containsKey(devowelQuery)) {
                        result[i] = vowelInsensitiveMap.get(devowelQuery);
                    } else {
                        result[i] = ""; 
                    }
                }
            }
        }
        return result;
    }
    
    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*'); 
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
