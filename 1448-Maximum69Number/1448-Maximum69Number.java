// Last updated: 9/21/2025, 7:55:51 PM
class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='9'){
                sb.setCharAt(i,'9');
                break;
            }
        }
        int ans=Integer.parseInt(sb.toString());
        return ans;
    }
}