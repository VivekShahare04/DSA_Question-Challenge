//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public String FirstNonRepeating(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            q.add(c);
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.poll();
            }
            
            if(q.isEmpty()){
                sb.append('#');
            }else{
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }
}