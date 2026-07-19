// Last updated: 7/19/2026, 8:09:51 PM
1 class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        long sum = 0;
5        long max = 0;
6        int left = 0;
7        for (int right = 0; right < nums.length; right++) {
8            sum += nums[right];
9            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
10            if (right - left + 1 > k) {
11                sum -= nums[left];
12                map.put(nums[left], map.get(nums[left]) - 1);
13                if (map.get(nums[left]) == 0) {
14                    map.remove(nums[left]);
15                }
16                left++;
17            }
18            if (right - left + 1 == k && map.size() == k) {
19                max = Math.max(max, sum);
20            }
21        }
22        return max;
23    }
24}