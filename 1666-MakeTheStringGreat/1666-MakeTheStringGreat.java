// Last updated: 10/11/2025, 11:02:51 PM
class Solution {
    public String makeGood(String s) {
        if(s.length()==0) return s;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            if(Character.toLowerCase(sb.charAt(i))==Character.toLowerCase(sb.charAt(i+1))){
                if(sb.charAt(i)!=sb.charAt(i+1)){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    i=Math.max(-1,i-2);
                }
            }
        }
        return String.valueOf(sb);
    }
}