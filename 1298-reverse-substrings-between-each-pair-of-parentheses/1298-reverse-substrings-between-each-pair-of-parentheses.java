class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                while(st.peek()!='('){
                    str.append(st.pop());
                }
                st.pop();
                while(str.length()>0){
                    st.push(str.charAt(0));
                    str.deleteCharAt(0);
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            str.insert(0,st.pop());
        }
        return str.toString();
    }
}