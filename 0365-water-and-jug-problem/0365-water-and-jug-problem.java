class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y)return false;
        //if(target==x+y)return true;
        if(target==0)return true;

        int gcd = GCD(x,y);
        return target%gcd==0;
    }

    public static int GCD(int x,int y){
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
}