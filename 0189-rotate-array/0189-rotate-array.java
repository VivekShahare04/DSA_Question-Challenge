class Solution {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int newidx  = (i+k)%nums.length;
            a[newidx]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=a[i];
        }

    }
}