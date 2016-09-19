public class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        
        int[] dp = new int[n];
        
        dp[n-1] = 1;
        
        for(int i=n-2;i>=0;i--) {
            
            for(int j=i+1;j<=nums[i]+i;j++) {
                if(j >= n || dp[j] == 1) {
                    dp[i] = 1;
                    break;
                }
            }
        }
        
        if(dp[0] == 1)
            return true;
        return false;
        
    }
}