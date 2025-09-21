// Last updated: 9/21/2025, 7:55:52 PM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (!hasZero(i) && !hasZero(j)) { // check whether the numbers consisting of 0 or not.
                ans[0] = i;
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
    // number 0 consist kr rha h ya nhi ?
    private boolean hasZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }
}
