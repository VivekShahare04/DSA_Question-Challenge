class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res=0;
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE);
        for(int a:arr){
            while(st.peek()<=a){
                int mid = st.pop();
                res = res + mid*Math.min(st.peek(),a);
            }
            st.push(a);
        }
        while(st.size()>2){
            res = res + st.pop()*st.peek();
        }
        return res;
    }
}