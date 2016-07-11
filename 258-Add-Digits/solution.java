public class Solution {
    public int addDigits(int num) {
        
        if(num == 0 || num < 10) return num;
       
        int sum = 0;
        
        while(num > 0) {
            
             sum += num%10;
             num = num/10;
             
             if(num == 0 && sum >=10)  { num = sum; sum = 0; }
        }
        
        return sum;
        
        
        // Without loop, Digital roots of number : https://en.wikipedia.org/wiki/Digital_root:: O(1)
        // return num%9==0?9:num%9;
        
    }
}