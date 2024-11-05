//{ Driver Code Starts

// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
       int sum=0;
       ArrayList<Integer> a = new ArrayList<>();
       int i=0;
       helper(arr,n,i,sum,a);
       return a;
    }
    
    public static void helper(ArrayList<Integer> arr,int n,int i,int sum,ArrayList<Integer> a){
        if(i==n){
            a.add(sum);
            return;
        }
        helper(arr,n,i+1,sum+arr.get(i),a);
        helper(arr,n,i+1,sum,a);
    }
}