// Last updated: 11/12/2025, 11:35:25 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> map= new HashSet<>();
        int[] arr= new int[2];
        int i=0;
        for(int num:nums){
            if(!map.isEmpty() && map.contains(num)){
                arr[i]=num;
                i=1;
            }else{
                map.add(num);
            }
            if(i>1) break;
        }
        return arr;
    }
}