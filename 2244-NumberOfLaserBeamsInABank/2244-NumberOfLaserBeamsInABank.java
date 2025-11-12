// Last updated: 11/12/2025, 11:35:58 AM
class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int total = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int curr = ones(bank[i]);
            if (curr > 0) {
                total += prev * curr;
                prev = curr;
            }
        }
        return total;
    }
    public int ones(String s){
        int c=0;
        while(s.length()>0){
            char ch= s.charAt(s.length()-1);
            if(ch=='1'){
                c++;
            }
            s = s.substring(0, s.length() - 1);          
        }
        return c;
    }
}