// Last updated: 9/23/2025, 6:07:47 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st= new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='*' && !st.isEmpty()){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
             sb.append(c);
        }
        return sb.toString();
    }
}