// Last updated: 9/21/2025, 7:58:26 PM
class Solution {
    public int romanToInt(String s) {
        int[] values = new int[128]; 
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = values[s.charAt(i)];

            if (i + 1 < s.length() && val < values[s.charAt(i + 1)]) {
                result -= val;
            } else {
                result += val;
            }
        }
        return result;
    }
}
