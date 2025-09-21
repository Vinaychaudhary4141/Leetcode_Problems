// Last updated: 9/21/2025, 7:54:55 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
       int odd_sum=n*n;
        int even_sum= n*(n+1);
        while(odd_sum!=0){
            int temp=odd_sum;
            odd_sum=even_sum%odd_sum;
            even_sum=temp;
        }
        return even_sum;
    }
}