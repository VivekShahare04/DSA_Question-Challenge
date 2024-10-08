//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int n = mat.length;
        
        if(n==0)return -1;
        
        int index=0;
        for(int i=1;i<n;i++){
            if(mat[index][i]==1){
                index=i;
            }
        }
        
        for(int i=0;i<n;i++){
            if(i!=index){
                if(mat[index][i]==1 || mat[i][index]==0){
                    return -1;
                }
            }
        }
        return index;
    }
}