// Last updated: 9/21/2025, 7:55:45 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        StringBuilder st=new StringBuilder();
        for(int i=0;i<k;i++){
            st.append(str[i]+" ");
        }
        String ans=st.toString();
        String an=ans.trim();
        return an;
    }
}