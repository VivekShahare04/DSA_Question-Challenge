// User function Template for Java

class Solution {
    
    class tuple{
        int first,second,third;
        
        tuple(int first,int second,int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    
    boolean verify(int i,int j,int n,int m,int[][] grid){
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]==1){
            return true;
        }
        return false;
    }
    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int n = grid.length;
        int m = grid[0].length;
        
        if(source[0]==destination[0] && source[1]==destination[1])return 0;
        
        Queue<tuple> q = new LinkedList<>();
        int[][] dist = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        
        dist[source[0]][source[1]] = 0;
        q.add(new tuple(0,source[0],source[1]));
        
        int[] dirrow = {-1,0,1,0};
        int[] dircol = {0,1,0,-1};
        
        while(!q.isEmpty()){
            tuple node = q.peek();
            q.poll();
            int dis = node.first;
            int r = node.second;
            int c = node.third;
            
            for(int i=0;i<4;i++){
                int newr = r + dirrow[i];
                int newc = c + dircol[i];
                
                if(verify(newr,newc,n,m,grid) && dis + 1 < dist[newr][newc]){
                    dist[newr][newc] = dis+1;
                    
                    if(newr==destination[0] && newc==destination[1]){
                        return dis+1;
                    }
                    q.add(new tuple(dis+1,newr,newc));
                }
            }
        }
        return -1;
    }
}
