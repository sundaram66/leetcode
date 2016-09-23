public class Solution {
    public double myPow(double x, int n) {
        
    
        if(n == 0) return 1;
        
        if(n == 1) return x;
        
        if(n==Integer.MIN_VALUE && x > 1) 
            return 0d;
        
 
        if(n < 0) {
            x = 1/x;
            n = -n;
        }
        
        double result = myPow(x,n/2);
        
        if(n%2 == 0) 
            return result*result;
        
        else
           return result*result*x;
        
    }
}