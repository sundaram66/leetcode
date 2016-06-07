public class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 0) return -1;
        if(n == 1 || n == 2) return nums[0]; 
        int result = 0;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;) {
           if(i+1 == n) return nums[i];
           if(nums[i] != nums[i+1]) return nums[i];
           i += 3;
        }
        
        return -1;
        
    }
}