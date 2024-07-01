class Solution {
    public int jump(int[] nums) {
        int jump=0,currend=0,current=0;
       for(int i=0;i<nums.length-1;i++){
           current = Math.max(current,i+nums[i]);
           if(i==currend){
               currend=current; 
               jump++; 
           }
           
       }
       return jump;
    }
}