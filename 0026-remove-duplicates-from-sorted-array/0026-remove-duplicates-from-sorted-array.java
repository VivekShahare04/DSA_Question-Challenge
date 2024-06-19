class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<count;j++){
                if(nums[i]==nums[j]){
                    isDuplicate = true;
                    break;
                }
            }
                if(!isDuplicate){
                    nums[count]=nums[i];
                    count++;
                }
            
        }

        return count;
        
    }
}