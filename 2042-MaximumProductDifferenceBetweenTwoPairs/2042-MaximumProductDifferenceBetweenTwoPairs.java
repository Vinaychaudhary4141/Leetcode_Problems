// Last updated: 8/1/2025, 11:56:13 AM
class Solution {
    public int maxProductDifference(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int n:nums){
            if(n>largest){
                secondLargest=largest;
                largest=n;
            }
            else if(n>secondLargest){
                secondLargest=n;
            }
            if(n<smallest){
                secondSmallest=smallest;
                smallest=n;
            }
            else if(n<secondSmallest){
                secondSmallest=n;
            }
        }
        return Math.abs(largest*secondLargest)-Math.abs(smallest*secondSmallest);
    }
}