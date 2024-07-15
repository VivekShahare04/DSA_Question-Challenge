//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
          if(s > 9*d || s==0){

            return "-1"; 

        }

        char[] digits = new char[d];

        s -= 1; 
        for(int i=d-1;i>0;i--){

            if(s > 9){

                digits[i] = '9';

                s -= 9;

            }else {

                digits[i] = (char) (s+ '0');

                s = 0;

            }

        }

        digits[0] = (char) (s + '1'); 

        return new String(digits);
    }
}
