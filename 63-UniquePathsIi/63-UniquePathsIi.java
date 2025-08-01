// Last updated: 8/1/2025, 11:57:23 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] maze) {
        int m= maze.length;
        int n= maze[0].length;
        Integer[][] visited= new Integer[m][n];
       return ways(maze,0,0,visited); 
    }
    public static int ways(int[][] maze,int r,int c,Integer[][]visited){
        if(r>=maze.length || c>=maze[0].length || maze[r][c]==1){
            return 0 ;
        }
        if(r==maze.length -1 && c==maze[0].length-1){
            return 1;
        }
        if(visited[r][c]!=null){
            return visited[r][c];
        }
        
         int right=ways(maze, r+1,c,visited);
         int down=ways(maze,r,c+1,visited);
        visited[r][c]=right+down;
        return visited[r][c];    
    }
}