// Last updated: 10/11/2025, 11:02:14 PM
class Solution {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        if (numFriends == 1) return word;  // no split
        
        int maxLen = n - numFriends + 1;
        String ans = "";
        
        for (int i = 0; i < n; i++) {
            int end = Math.min(n, i + maxLen);
            String cur = word.substring(i, end);
            if (cur.compareTo(ans) > 0) ans = cur;
        }
        return ans;
    }
}
