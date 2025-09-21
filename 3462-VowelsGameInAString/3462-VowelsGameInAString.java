// Last updated: 9/21/2025, 7:55:16 PM
class Solution {
    public boolean isvowel(char c){
        return " AEIOUaeiou".indexOf(c)!=-1;
    }
    public boolean doesAliceWin(String s) {
      int count =0;
      for(char c: s.toCharArray()){
        if(isvowel(c)) count++;
      }
      return count>0;
    }
}