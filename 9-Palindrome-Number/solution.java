public class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
        if(x < 10) return true;
        
        int original = x;
        int reverse = 0;
        
        while(x > 0) {
            reverse = reverse * 10  + x%10;
            x /= 10;
        }
        
        return original == reverse;
    }
}