class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        int i=0;

        while(i<k){
            sum = sum + nums[n-1];
            nums[n-1] = nums[n-1]+1;
            i++;
        }
        return sum;
    }
}