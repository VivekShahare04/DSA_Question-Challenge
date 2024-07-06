//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int ans=-1;
        Set<Integer> keys = map.keySet();
        for(Integer key:keys){
            if(map.get(key)>size/2){
                ans=key;
            }
        }
        return ans;
    }
}