// Last updated: 9/21/2025, 7:56:45 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        
        if (n == 0) return arr;
        if (n == 1) {
            arr.add(nums[0]);
            return arr;
        }
        Arrays.sort(nums);
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    arr.add(nums[i - 1]);
                }
                count = 1;
            }
        }
        if (count > n / 3) {
            arr.add(nums[n - 1]);
        }
        return arr;
    }
}