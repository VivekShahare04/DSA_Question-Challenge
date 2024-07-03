class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int b[] = new int[set.size()];
        int i=0;
        for(int num:set){
            b[i]=num;
            i++;
        }
        Arrays.sort(b);
        return ((b.length>=3)?b[b.length-3]:b[b.length-1]);
    }
}