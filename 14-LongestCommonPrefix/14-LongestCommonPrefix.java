// Last updated: 8/1/2025, 11:58:02 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
      String word=strs[0];
      for(int i=1;i<strs.length;i++){
        while(!strs[i].startsWith(word)){
            word=word.substring(0,word.length()-1);
            if(word.isEmpty()){
                return "";
            }
        }
      }  
      return word
      ;
    }
}