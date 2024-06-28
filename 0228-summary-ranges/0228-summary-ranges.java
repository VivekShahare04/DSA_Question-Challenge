class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int start = nums[i];
            while(i<n-1 && nums[i+1] == nums[i]+1){
                i++;
            }
            if(start !=nums[i]){
                list.add(start+ "->" +nums[i]);
            }else{
                list.add(String.valueOf(start));
            }
        }
        return list;

    }
}