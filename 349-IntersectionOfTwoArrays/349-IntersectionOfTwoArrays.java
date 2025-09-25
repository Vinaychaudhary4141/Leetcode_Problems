// Last updated: 9/25/2025, 8:08:43 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set1=new TreeSet<>();
        for(int n: nums1){
           set1.add(n);
        }
      Set<Integer> set2=new TreeSet<>();
        for(int n:nums2){
        set2.add(n);
        }
        set1.retainAll(set2);

        int[] arr= new int[set1.size()];
        int i=0;
        for(int n: set1){
            arr[i++]=n;
        }
          return arr;
    }
}