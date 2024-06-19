class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int Lp[] = new int[n];
        int Rp[] = new int[n];
        int answer[] = new int[n];

        Lp[0]=1;
        for(int i=1;i<n;i++){
            Lp[i] = Lp[i-1]*nums[i-1];
        }

        Rp[n-1]=1;
        for(int i=n-2;i>=0;i--){
            Rp[i] = Rp[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            answer[i]=Lp[i]*Rp[i];
        }
        return answer;
    }
}