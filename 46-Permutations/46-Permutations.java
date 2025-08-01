// Last updated: 8/1/2025, 11:57:38 AM
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {
            if (current.contains(num)) {
                continue;
            }

            current.add(num);
            backtrack(nums, current, results);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3};
        System.out.println(solution.permute(nums1));
        // Expected output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]

        int[] nums2 = {0, 1};
        System.out.println(solution.permute(nums2));
        // Expected output: [[0,1], [1,0]]

        int[] nums3 = {1};
        System.out.println(solution.permute(nums3));
        // Expected output: [[1]]
    }
}
