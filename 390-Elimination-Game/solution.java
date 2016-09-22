public class Solution {
    public int lastRemaining(int n) {

        int step = 1;
        int start = 1;
        boolean lr = true;
        int remaining = n;
        
        while(remaining > 1) {
            
            if(lr || remaining % 2 ==1 ){
                start = start + step;
            }
            
            remaining /= 2;
            step *= 2;
            lr = !lr;
            
        }

        return start;
    }
}