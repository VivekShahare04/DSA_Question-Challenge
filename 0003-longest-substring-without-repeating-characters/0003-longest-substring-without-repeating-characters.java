class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0;
        int right=0;
        int left=0;

        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max= Math.max(max,set.size());
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}