public class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 0) return -1;
        if(nums.length == 1 || nums.length == 2) return nums[0]; 
        int result = 0;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;) {
           if(i+1 == nums.length) return nums[i];
           if(nums[i] != nums[i+1]) return nums[i];
           i += 3;
        }
        
        return -1;
        
    }
}