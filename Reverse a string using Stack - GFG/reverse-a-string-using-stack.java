//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> s = new Stack<>();
        int index = 0;
        while(index < S.length()){
            s.push(S.charAt(index));
            index++;
        }
        
        StringBuilder str = new StringBuilder();
        while(!s.isEmpty()){
            char ch = s.pop();
            str.append(ch);
        }
        return str.toString();
        
    }

}