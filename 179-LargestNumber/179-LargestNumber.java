// Last updated: 9/21/2025, 7:56:57 PM
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String largestNumber(int[] nums) {
        String[] strNums = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) return "0";

        return String.join("", strNums);
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        System.out.println(largestNumber(nums1)); 

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums2)); 
        int[] nums3 = {0, 0};
        System.out.println(largestNumber(nums3)); 
    }
}
