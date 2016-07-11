public class Solution {
    public int getSum(int a, int b) {
        
        int carry = 0;
        
        if(b == 0) return a;
        
        while(b != 0) {
            carry = a & b;
            a = a^b;
            b = carry << 1;
        }
        
        return a;
        
        //return getSum(a^b,(a&b)<<1);
            
    }
}