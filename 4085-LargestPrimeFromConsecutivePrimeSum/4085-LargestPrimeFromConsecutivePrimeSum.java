// Last updated: 1/16/2026, 10:12:24 PM
class Solution {
    public int largestPrime(int n) {
        boolean[] prime= sieve(n);
        int sum=0, ans=0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                sum+=i;
                if(sum>n)break;
                if(prime[sum])ans=sum;
            }
        }
        return ans;
    }
    private boolean[] sieve(int n){
        boolean[] p= new boolean[n+1];
        Arrays.fill(p,true);
        if(n>=0)p[0]=false;
        if(n>=1)p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j+=i)
                    p[j]=false;
            }
        }
        return p;
    }
}