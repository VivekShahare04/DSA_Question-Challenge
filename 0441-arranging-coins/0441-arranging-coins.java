class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int i=0;
        while(i>=0){
            n = n-i-1;
            if(n<0){
                break;
            }else{
                count++;
            }
            i++;
        }
        return count;
    }
}