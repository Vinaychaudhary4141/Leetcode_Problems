// Last updated: 11/26/2025, 12:59:21 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set= new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}