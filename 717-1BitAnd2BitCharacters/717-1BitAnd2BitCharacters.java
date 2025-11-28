// Last updated: 11/28/2025, 9:47:34 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
       for(int i=0;i<bits.length;i++){
        if(i==bits.length-1) return true;
        if(bits[i]==1) i++;
       } 
       return false;
    }
}