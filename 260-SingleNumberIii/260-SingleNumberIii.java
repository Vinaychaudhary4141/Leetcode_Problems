// Last updated: 8/1/2025, 11:56:35 AM
public class Solution {
    public int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers to get xorResult = a ^ b
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }

        // Step 2: Find the rightmost set bit in xorResult
        int rightmostSetBit = xorResult & -xorResult;

        // Step 3: Partition numbers into two groups and XOR each group
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        // num1 and num2 are the two unique numbers
        return new int[] { num1, num2 };
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(solution.singleNumber(nums1)));  // Output: [3, 5] or [5, 3]

        int[] nums2 = {-1, 0};
        System.out.println(Arrays.toString(solution.singleNumber(nums2)));  // Output: [-1, 0] or [0, -1]

        int[] nums3 = {0, 1};
        System.out.println(Arrays.toString(solution.singleNumber(nums3)));  // Output: [1, 0] or [0, 1]
    }
}
