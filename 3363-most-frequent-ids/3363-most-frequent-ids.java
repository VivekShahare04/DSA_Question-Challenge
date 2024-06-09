class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        int n = nums.length;

        Map<Integer,Long> map = new HashMap<>();
        PriorityQueue<pair> hp = new PriorityQueue<>((a,b)->Long.compare(b.freq,a.freq));

        long ans[] = new long[n];
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],(long)freq[i]);
                hp.offer(new pair(nums[i],freq[i]));
            }
            else{
                map.put(nums[i],map.get(nums[i])+freq[i]);
                hp.offer(new pair(nums[i],map.get(nums[i])));

                while(hp.peek().freq != map.get(hp.peek().num)){
                    hp.remove();
                }
            }
            ans[i]=hp.peek().freq;

        }
        return ans;

    }
    class pair{
        int num;
        long freq;

        public pair(int num,long freq){
            this.num=num;
            this.freq=freq;
        }
    }
}