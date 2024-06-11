class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int last = -1; 
        int current = 0;  
        
        while (n > 0) {
            if ((n & 1) == 1) {
                if (last != -1) {
                    max = Math.max(max, current - last);
                }
                last = current;
            }
            current++;
            n >>= 1;
        }
        
        return max;
    }
}
