public class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;

        int maxIndex = nums[0];

        for(int i=0;i<n;i++) {
            
            if(maxIndex >= n-1) return true;
            
            // Go only till the range(maxIndex) from Current Index
            if(i > maxIndex) return false;
            
            //maxIndex that can be reached from the currentIndex i,
            maxIndex = Math.max(maxIndex,i+nums[i]);
        }
        
        
        
        if(maxIndex >= n-1 || (maxIndex == 0 && n == 1)) return true;
        
        
        return false;
        
    }
}