// Last updated: 1/16/2026, 10:12:32 PM
import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("electronics", new ArrayList<>());
        map.put("grocery", new ArrayList<>());
        map.put("pharmacy", new ArrayList<>());
        map.put("restaurant", new ArrayList<>());

        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (!map.containsKey(businessLine[i])) continue;
            if (code[i].length() == 0) continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            map.get(businessLine[i]).add(code[i]);
        }

        List<String> ans = new ArrayList<>();
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        for (String b : order) {
            List<String> list = map.get(b);
            Collections.sort(list);
            ans.addAll(list);
        }

        return ans;
    }
}