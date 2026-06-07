// User function Template for Java
class Solution {
    class Pair{
        int first,sec;
        Pair(int first,int sec){
            this.first = first;
            this.sec = sec;
        }
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        List<List<Pair>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            List<Pair> t = new ArrayList<>();
            adj.add(t);
        }
        
        for(int i=0;i<E;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            
            adj.get(u).add(new Pair(v,wt));
        }
        
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                toposort(i,adj,vis,st);
            }
        }
        
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[0]=0;
        
        while(!st.isEmpty()){
            int node = st.peek();
            st.pop();
            
            for(Pair p:adj.get(node)){
                int v = p.first;
                int wt = p.sec;
                
                if(dist[node] != Integer.MAX_VALUE &&dist[node]+wt < dist[v]){
                    dist[v] = dist[node]+wt;
                }
            }
        }
        
        for(int i=0;i<V;i++){
            if(dist[i]==Integer.MAX_VALUE){
                dist[i]=-1;
            }
        }
        
        return dist;
    }
    
    private void toposort(int node,List<List<Pair>> adj,int[] vis,Stack<Integer> st){
        vis[node]=1;
        
        for(Pair p : adj.get(node)){
            int v = p.first;
            if(vis[v]==0){
                toposort(v,adj,vis,st);
            }
        }
        st.push(node);
    }
}