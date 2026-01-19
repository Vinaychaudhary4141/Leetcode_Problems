// Last updated: 1/19/2026, 7:34:54 PM
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int a= center[0];
        int b= center[1];
        int bx=-1, by=-1;
        int bq=-1;
        for(int[] t: towers){
            int dist=Math.abs(t[0]-a)+Math.abs(t[1]-b);
            if(dist<=radius){
                if(t[2]>bq || (t[2]==bq && (t[0]<bx || (t[0]==bx && t[1]<by)))){
                    bq=t[2];
                    bx=t[0];
                    by=t[1];
                }
            }
        }
        return new int[]{bx,by};
    }
}