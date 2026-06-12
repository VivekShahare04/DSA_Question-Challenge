class Solution {
    
    class tuple{
        int first,second,third;
        tuple(int first,int second,int third){
            this.first = first;
            this.second=second;
            this.third=third;
        }
    }
    
    boolean verify(int i,int j,int n,int m,int[][] mat){
        if(i>=0 && i<n && j>=0 && j<m ){
            return true;
        }
        return false;
    }
    
    public int minCostPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        PriorityQueue<tuple> pq = new PriorityQueue<>((a,b)->a.first-b.first);
        
        int[][] dist = new int[n][m];
        for(int[] d:dist){
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        
        dist[0][0]=0;
        pq.add(new tuple(0,0,0));
        
        int[] dirr = {-1,0,1,0};
        int[] dirc = {0,1,0,-1};
        
        while(!pq.isEmpty()){
            tuple node = pq.poll();
            
            int dis = node.first;
            int r = node.second;
            int c = node.third;
            
            if(dis > dist[r][c])
                continue;
        
            if(r == n-1 && c == m-1)
                return dis;
            
            for(int i=0;i<4;i++){
                int newr = r + dirr[i];
                int newc = c + dirc[i];
                
                if(verify(newr,newc,n,m,mat)){
                    
                    int edgecost = Math.abs(mat[r][c] - mat[newr][newc]);
                    int newdist = Math.max(dis,edgecost);
                    
                    if(newdist < dist[newr][newc]){
                        dist[newr][newc] = newdist;
                    
                        pq.add(new tuple(newdist,newr,newc));
                    }
                    
                    
                }
            }
        }
        return -1;
    }
}
