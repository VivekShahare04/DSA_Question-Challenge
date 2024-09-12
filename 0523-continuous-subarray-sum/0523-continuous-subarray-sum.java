class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixsum=0;
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            prefixsum = prefixsum + nums[i];

            if(k!=0){
                prefixsum = prefixsum%k;
            }

            if(map.containsKey(prefixsum)){
                if(i-map.get(prefixsum)>1){
                    return true;
                }
            }else{
                map.put(prefixsum,i);
            }
        }
        return false;
    }
}