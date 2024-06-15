class Solution {
    public int minTimeToType(String word) {
        int count=0;
        char pointer = 'a';

        for(char c:word.toCharArray()){
            if(pointer==c){
                count++;
            }else{
                int diff = Math.abs(pointer-c);
                count = count + Math.min(diff,26-diff);
                count++;
            }
            pointer=c;
        }
        return count;
    }
}