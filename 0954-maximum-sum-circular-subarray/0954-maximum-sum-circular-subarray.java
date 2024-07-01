class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxsum=nums[0];
        int maxcurrent = nums[0];
        int minsum = nums[0];
        int mincurrent = nums[0];
        int total = nums[0];

        for(int i=1;i<n;i++){
            maxcurrent = Math.max(nums[i],maxcurrent+nums[i]);
            maxsum = Math.max(maxsum,maxcurrent);
        }
        for(int i=1;i<n;i++){
            mincurrent = Math.min(nums[i],mincurrent+nums[i]);
            minsum = Math.min(minsum,mincurrent);
            total=total+nums[i];
        }
        if(total==minsum){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}