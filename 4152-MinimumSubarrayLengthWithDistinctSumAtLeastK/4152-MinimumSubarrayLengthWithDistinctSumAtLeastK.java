// Last updated: 1/16/2026, 10:12:19 PM
class Solution {
    public int minLength(int[] nums, int k) {
        int left = 0;
        long sum = 0;
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            set.put(nums[right], set.getOrDefault(nums[right], 0) + 1);
            if (set.get(nums[right]) == 1) {
                sum += nums[right];
            }

            while (sum >= k) {
                ans = Math.min(ans, right - left + 1);
                set.put(nums[left], set.get(nums[left]) - 1);
                if (set.get(nums[left]) == 0) {
                    sum -= nums[left];
                    set.remove(nums[left]);
                }
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
