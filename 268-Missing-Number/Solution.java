public class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        int origSum = (n * (n+1))/2;
        int givenSum = 0;
        
        for(int i=0;i<n;i++) {
            givenSum += nums[i];
        }
        
        return origSum - givenSum;
        
    }
}