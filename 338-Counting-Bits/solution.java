public class Solution {
    public int[] countBits(int num) {
        
        int[] output = new int[num+1];
        output[0] = 0;
        int twoPow = 1;
        
        for(int i=1;i<=num;i++) {
            if(i==twoPow) {
                output[i] = 1;
                twoPow <<= 1;
            }
            else {
                output[i] = output[i/2] + output[i%2];
            }
            
        }
        
        return output;
    }
}