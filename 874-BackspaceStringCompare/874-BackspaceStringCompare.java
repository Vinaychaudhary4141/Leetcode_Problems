// Last updated: 9/23/2025, 6:08:11 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int l1= s.length();
        int l2= t.length();
        int n= Math.max(l1,l2);
        String nyi_s="";
        String nyi_t="";
        for(int i=0;i<n;i++){
            if(i<l1){
                if(s.charAt(i)=='#' && !nyi_s.isEmpty()){
                   nyi_s= nyi_s.substring(0,nyi_s.length()-1);
                }else if(s.charAt(i)!='#'){
                    nyi_s+=s.charAt(i);
                }
            }
            if(i<l2){
                if(t.charAt(i)=='#' && !nyi_t.isEmpty()){
                    nyi_t=nyi_t.substring(0,nyi_t.length()-1);
                }else if(t.charAt(i)!='#'){
                    nyi_t+=t.charAt(i);
                }
            }
        }  
        return (nyi_s.equals(nyi_t));
    }
}