//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> kLargest(int arr[], int k) {
        // PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        // for(int i=0;i<k;i++){
        //     minheap.add(arr[i]);
        // }
        
        // for(int i=k;i<arr.length;i++){
        //     if(arr[i]>minheap.peek()){
        //         minheap.poll();
        //         minheap.add(arr[i]);
        //     }
        // }
        
        // ArrayList<Integer> list = new ArrayList<>();
        // list.sort(Collections.reverseOrder());
        // return list;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int n:arr){
            list.add(n);
        }
        
        list.sort(Collections.reverseOrder());
        
        return list.subList(0,k);
    }
}

//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            List<Integer> ans = ob.kLargest(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends