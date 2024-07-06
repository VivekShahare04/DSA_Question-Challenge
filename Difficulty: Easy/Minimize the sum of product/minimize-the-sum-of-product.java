//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];

            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.minValue(a, b, n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public long minValue(long a[], long b[], long n) {
        Long[] aBoxed = Arrays.stream(a).boxed().toArray(Long[]::new);
        Long[] bBoxed = Arrays.stream(b).boxed().toArray(Long[]::new);
        
        Arrays.sort(aBoxed);
        Arrays.sort(bBoxed,Comparator.reverseOrder());
        
        long sum=0;
        for(int i=0;i<n;i++){
            sum = sum + aBoxed[i]*bBoxed[i];
        }
        return sum;
        
    }
}