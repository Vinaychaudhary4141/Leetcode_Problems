// Last updated: 10/4/2025, 2:19:23 PM
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), set);
        return new ArrayList<>(set);
    }
    private void backtrack(int[] nums, int index, List<Integer> curr, Set<List<Integer>> set) {
        if (curr.size() >= 2) set.add(new ArrayList<>(curr));
        for (int i = index; i < nums.length; i++) {
            if (!curr.isEmpty() && nums[i] < curr.get(curr.size() - 1)) continue;
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr, set);
            curr.remove(curr.size() - 1);
        }
    }
}
