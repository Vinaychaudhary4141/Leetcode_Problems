// Last updated: 9/21/2025, 7:56:09 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int a = -1, b = -1;
        int countB = 0; 
        int curr = 0;   
        int max = 0;

        for (int i = 0; i < n; i++) {
            int f = fruits[i];

            if (f == a || f == b) {
                curr++;
            } else {
                curr = countB + 1; 
            }

            if (f == b) {
                countB++;
            } else {
                countB = 1;
                a = b;
                b = f;
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}