class Solution {
    class Pair{
        int first,second;
        
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[] shortestPath(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        
        int[] dis = new int[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        
        dis[src]=0;
        
        
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.first - b.first);
        
        
        pq.add(new Pair(0,src)); // dist,node
        
        while(!pq.isEmpty()){
            Pair curr = pq.poll();

            int dist = curr.first;
            int node = curr.second;
            
            for(int it:adj.get(node)){
                if(dist+1<dis[it]){
                    dis[it] = dist+1;
                    pq.add(new Pair(dis[it],it));
                }
            }
        }
        
        for(int i=0;i<V;i++){
            if(dis[i]==Integer.MAX_VALUE){
                dis[i]=-1;
            }
        }
        
        return dis;
    }
}
