// Last updated: 9/21/2025, 7:56:22 PM
class Solution {
    public int firstUniqChar(String s) {
     for(int i=0; i<s.length();i++){
        String sub=s.substring(i+1);
       if (!sub.contains(String.valueOf(s.charAt(i))) 
                && s.indexOf(s.charAt(i)) == i){
            return i;
        }
     }   
     return -1;
    }
}