class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count=0;
        int maxdepth=0;

        for(Character c : s.toCharArray()){
           if(c=='('){
            st.push(c);
            count++;
            if(count>maxdepth){
                maxdepth=count;
            }
           }
           else if(c==')'){
            if(!st.isEmpty() && (st.peek()=='(')){
                st.pop();
                count--;
            }
           }
        }
        return maxdepth;
    }
}