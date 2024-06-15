class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        int n = position.length;

        for(int i=0;i<n;i++){
            if(position[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}