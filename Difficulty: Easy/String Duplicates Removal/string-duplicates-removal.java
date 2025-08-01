//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }
        }
        for(char c:set){
            sb.append(c);
        }
        return sb.toString();
    }
}
