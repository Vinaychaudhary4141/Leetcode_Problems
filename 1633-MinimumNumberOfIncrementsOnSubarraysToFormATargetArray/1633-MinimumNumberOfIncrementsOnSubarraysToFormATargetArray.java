// Last updated: 11/26/2025, 12:59:40 PM
class Solution {
    public int minNumberOperations(int[] target) {
        int prev=target[0];
        int ans=prev;
        for(int i=1;i<target.length;i++){
            if(target[i]>prev){
                ans+=target[i]-prev;
            }
            prev=target[i];
        }
        return ans;
    }
}