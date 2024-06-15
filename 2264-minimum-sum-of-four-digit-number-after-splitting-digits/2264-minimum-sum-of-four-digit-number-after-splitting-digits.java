class Solution {
    public int minimumSum(int num) {
        int[] digit = new int[4];
        int i=0;
        while(i<=3){
            digit[i] = num%10;
            i++;
            num = num/10;
        }
        Arrays.sort(digit);

        return digit[0]*10+digit[2] + digit[1]*10+digit[3];
    }
}