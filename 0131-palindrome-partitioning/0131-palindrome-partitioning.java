class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }

    public void backtrack(String s,int start,List<String> list,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int end=start+1;end<=s.length();end++){
            if(ispalindrome(s,start,end-1)){
                list.add(s.substring(start,end));
                backtrack(s,end,list,result);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean ispalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}