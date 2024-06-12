class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxsum=0;

        for(int i=0;i<nums.length;i++){
            maxsum = Math.max(maxsum,nums[i]+nums[n-i-1]);
        }
        return maxsum;
    }
}