class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum=0;

        for(int i=0;i<n;i=i+2){
            sum = sum + nums[i];
        }
        return sum;
    }
}