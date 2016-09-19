public class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;

        int maxIndex = nums[0];

        for(int i=0;i<n;i++) {
            if(maxIndex >= n) return true;
            if(i > maxIndex) break;
            maxIndex = Math.max(maxIndex,i+nums[i]);
        }
        
        if(maxIndex >= n-1) return true;
        if(maxIndex == 0 && n == 1) return true;
        return false;
        
    }
}