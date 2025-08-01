// Last updated: 8/1/2025, 11:56:39 AM
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        
        int temp = 0;
        
        for (int i = 1; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1] + 1) {
                continue;
            } else {
                int start = nums[temp];
                int end = nums[i - 1];
                
                // Add the range to the list
                if (start == end) {
                    result.add(String.valueOf(start)); // Single number case
                } else {
                    result.add(start + "->" + end); // Range case
                }
                
                temp = i; // Update temp to new start
            }
        }
        
        return result;
    }
}
