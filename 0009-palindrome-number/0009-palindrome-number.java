class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem;
        int sum = 0;
        if(x==0){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }
        while(x!=0){
            rem = x%10;
            x = x / 10;
            sum = (sum * 10) + rem;
        }
        if(sum == temp){
            return true;
        }else{
            return false;
        }
        
    }
}