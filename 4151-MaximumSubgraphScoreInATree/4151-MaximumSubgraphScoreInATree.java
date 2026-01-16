// Last updated: 1/16/2026, 10:12:18 PM
class Solution {
    public int[] maxSubgraphScore(int n, int[][] edges, int[] good) {
        int[][] ranivestel= edges;
        List<Integer> [] g= new List[n];
        for(int i=0;i<n;i++) g[i]= new ArrayList<>();
        for(int[] e:edges){
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        int[] down= new int[n];
        int[] ans= new int[n];
        dfs1(0,-1,g,good,down);
        dfs2(0,-1,g,down,ans,0);
        return ans;
    }
    private int dfs1(int u, int p, List<Integer>[] g, int[] good, int[] down){
        int val= good[u]== 1? 1:-1;
        for(int v:g[u]){
            if(v==p) continue;
            int child= dfs1(v,u,g,good, down);
            if(child>0)val+=child;
        }
        return down[u]=val;
    }
    private void dfs2(int u, int p, List<Integer>[]g ,  int[] down, int[] ans, int parentGain){
        ans[u]=down[u]+Math.max(0, parentGain);
        for(int v:g[u]){
            if(v==p) continue;
            int withoutV = ans[u]-Math.max(0, down[v]);
            dfs2(v, u , g , down  , ans , withoutV);
        }
    }
}