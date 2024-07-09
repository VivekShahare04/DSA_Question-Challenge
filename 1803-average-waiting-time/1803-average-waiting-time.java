class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double totaltime = 0;
        double arrival =0;

        for (int i = 0; i < n; i++) {
            if(arrival<customers[i][0]){
                arrival = customers[i][0];
            }
            double finishtime = arrival + customers[i][1];
            totaltime = totaltime + (finishtime - customers[i][0]);
            arrival = finishtime;
        }
        
        double avgtime = totaltime / n;
        return avgtime;
    }
}
