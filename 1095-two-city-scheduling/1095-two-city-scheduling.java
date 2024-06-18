class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int mincost=0;
        Arrays.sort(costs,(a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        for(int i=0;i<costs.length/2;i++){
            int acost = costs[i][0];
            int bcost = costs[i+costs.length/2][1];
            mincost = mincost + acost;
            mincost = mincost + bcost;

        }
        return mincost;
    }
}