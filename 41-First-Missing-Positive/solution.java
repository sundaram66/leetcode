public class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i = 0;i<n;i++) {
            if(nums[i] > 0 && nums[i] <= n) {
                res[nums[i]-1] = -1;
            }
        }
        int j=0;
        for(j=0;j<n;j++) {
            if(res[j] == 0) return j+1;
        }
        
        return j+1;
    }
}