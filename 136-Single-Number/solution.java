public class Solution {
    public int singleNumber(int[] nums) {
        
        int n = nums.length;
        
        if(n==0) return -1;
        int result = nums[0];
        
        for(int i=1;i<n;i++) {
            result ^= nums[i];
        }
        
        return result;
        
        
    }
}