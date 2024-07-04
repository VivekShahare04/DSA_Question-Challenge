class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int second=0;
        for(int i=0;i<n-1;i++){
            if(timeSeries[i+1]<=timeSeries[i]+duration-1){
                second = second + timeSeries[i+1]-timeSeries[i];
            }else{
                second=second + duration;
            }
        }
        second = second+duration;
        return second;
    }
}