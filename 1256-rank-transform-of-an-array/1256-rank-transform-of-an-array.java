class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int num:sorted){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }
            
        int[] ans = new int[arr.length];
        for(int k=0;k<arr.length;k++){
            ans[k]=map.get(arr[k]);
        }
        return ans;
    }
}