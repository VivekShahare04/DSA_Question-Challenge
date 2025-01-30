//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }

            int x = sc.nextInt();

            if (new Solution().matSearch(mat, x))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;
        return search(mat,n,m,x,0,m-1);
    }
    public static boolean search(int mat[][],int n,int m,int x,int i,int j){
        if(i>=n|| j<0){
            return false;
        }
        if(mat[i][j]==x){
            return true;
        }
        
        if(mat[i][j]>x){
            return search(mat,n,m,x,i,j-1);
        }
            return search(mat,n,m,x,i+1,j);
    }
}