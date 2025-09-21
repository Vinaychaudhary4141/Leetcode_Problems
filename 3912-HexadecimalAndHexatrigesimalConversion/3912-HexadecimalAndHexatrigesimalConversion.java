// Last updated: 9/21/2025, 7:54:53 PM
class Solution {
    public String concatHex36(int n) {
        int square=n*n;
        int cube=square*n;
        StringBuilder st= new StringBuilder();
        String base16=Integer.toString(square,16).toUpperCase();
        String base36=Integer.toString(cube,36).toUpperCase();
        st.append(base16);
        st.append(base36);
        return st.toString();

    }
}