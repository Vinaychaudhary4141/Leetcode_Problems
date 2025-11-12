// Last updated: 11/12/2025, 11:34:50 AM
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>>map= new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],x-> new ArrayList<>()).add(i);
            List<Integer> list= map.get(nums[i]);
            if(list.size()>=3){
                int n=list.size();
                int a=list.get(n-3);
                int b=list.get(n-2);
                int c= list.get(n-1);
                int dist=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                ans=Math.min(ans,dist);
            }
        }
        return ans==Integer.MAX_VALUE? -1: ans;
    }
}