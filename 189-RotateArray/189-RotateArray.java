// Last updated: 8/1/2025, 11:56:44 AM
class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
        
    }
    public static void Rotate(int[] nums, int k) {
		int n = nums.length;
		k = k%n;
		// Staring n=k Reverse kro
		Reverse(nums, 0, n-k-1);
		
		//last ke k reverse kro 
		Reverse(nums, n-k, n-1);
		
		// all element reverse 
		Reverse(nums, 0, n-1);
	}
	
	public static void Reverse(int[] nums, int i, int j) {
		while (i<j) {
			int temp = nums[i];
			nums[i]= nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
    }
}