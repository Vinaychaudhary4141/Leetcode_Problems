// Last updated: 8/1/2025, 11:57:37 AM
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, results);
        return results;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip used elements or duplicates
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            
            current.add(nums[i]);
            used[i] = true;
            backtrack(nums, current, used, results);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 2};
        System.out.println(solution.permuteUnique(nums1));
        // Expected output: [[1,1,2], [1,2,1], [2,1,1]]

        int[] nums2 = {1, 2, 3};
        System.out.println(solution.permuteUnique(nums2));
        // Expected output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
    }
}
