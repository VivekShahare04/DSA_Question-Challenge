class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int move=0;
        int nxt = nums[0]+1;
        for(int i=1;i<n;i++){
            if(nxt>=nums[i]){
                move = move + (nxt++ - nums[i]);
            }else{
                nxt = nums[i]+1;
            }
        }
        return move;
    }
}