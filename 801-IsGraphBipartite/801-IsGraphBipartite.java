// Last updated: 11/28/2025, 9:47:28 PM
class Solution {
    //agr acyclic h to always bi-partite.
    // agar cyclic h aur cycle odd length ki h to never bi-partite.
    // agar cyclic h aur length even h to bi-partite.
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q= new LinkedList<>();
        HashMap<Integer,Integer> visited= new HashMap<>();
        for(int i=0;i<graph.length;i++){
            //vtx mil jaayenge
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty()){
                //1. remove
                BipartitePair rp= q.poll();
                //2. Ignore if already visited
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx)!=rp.dis){
                        return false;
                    }
                    continue;
                }
                //3. marked visited
                visited.put(rp.vtx,rp.dis);
                //4. self work
                //5. Add unvisited neigbours
                for(int nbrs:graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs,rp.dis+1));
                    }
                }
            }
        }
        return true;
      
    }
    static class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx, int dis){
            this.vtx=vtx;
            this.dis= dis;
        }
    }
}