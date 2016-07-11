public class Solution {
    public int addDigits(int num) {
        
        if(num == 0 || num < 10) return num;
       
        
        // Without loop, Digital roots of number : https://en.wikipedia.org/wiki/Digital_root
        
        return num%9==0?9:num%9;
        
    }
}