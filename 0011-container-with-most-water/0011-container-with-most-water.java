class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int max=0;
        while(low<high){
            int l = high-low;
            int h = 0;
            if(height[low]<height[high]){
                h = height[low];
                low++;
            }
           else{
               h = height[high];
               high--;
           }
           int area = l*h;
           if(area>max){
               max=area;
           }
        }
        return max;

    }
}