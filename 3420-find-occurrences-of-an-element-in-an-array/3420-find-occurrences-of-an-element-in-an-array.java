class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                list.add(i);
            }
        }
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int occur = queries[i];
            if(occur>0 && occur<=list.size()){
                ans[i] = list.get(occur-1);
            }else{
                ans[i]=-1;
            }
        }
        return ans;
    }
}