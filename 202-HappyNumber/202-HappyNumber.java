// Last updated: 9/21/2025, 7:56:53 PM
class Solution {
    public int square(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10) *(n%10);
            n/=10;
        }return sum;
    }
    public boolean isHappy(int n) {
        if(n==1) return true;
        Set<Integer> set= new HashSet<>();
        while(true){
            int temp= square(n);
            if(set.contains(temp)) return false;
            if(temp==1) return true;
            set.add(temp);
            n=temp;
        }
        
    }
}