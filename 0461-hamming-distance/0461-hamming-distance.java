class Solution {
    public int hammingDistance(int x, int y) {
        int xor= x^y;
        int dist =0;

        while(xor!=0){
            if(xor%2==1){
                dist++;
            }
            xor=xor>>1;
        }
        return dist;
    }
}