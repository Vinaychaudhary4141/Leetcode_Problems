// Last updated: 8/1/2025, 11:56:40 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the number is already in the set, it's a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Add the number to the set
            seen.add(num);
        }
        
        // No duplicates found
        return false;
    }
}