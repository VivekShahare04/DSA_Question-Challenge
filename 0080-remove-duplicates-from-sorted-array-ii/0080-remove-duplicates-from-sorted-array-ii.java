class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        int occur =1;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                occur++;
            }else{
                occur=1;
            }

            if(occur<=2){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}