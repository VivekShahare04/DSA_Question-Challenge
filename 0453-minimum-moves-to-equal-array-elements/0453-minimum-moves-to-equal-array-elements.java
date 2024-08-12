class Solution {
    public int minMoves(int[] nums){
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            int b = -1*(nums[0]-nums[i]);
            count = count+b;
        }
        return count;  
    }
}