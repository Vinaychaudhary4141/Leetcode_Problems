// Last updated: 8/1/2025, 11:56:10 AM
class Solution {
    public String smallestNumber(String pattern) {
        int[] ans = new int[pattern.length() + 1];
        int c = 1;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= pattern.length(); i++){
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                ans[i] = c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()] = c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String s = "";
        for(int v : ans){
            s += v;
        }
        return s;
    }
}