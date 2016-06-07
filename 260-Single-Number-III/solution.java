public class Solution {
    public int[] singleNumber(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[2];
        
        if(n==0) return result;
        
        int exorAll = nums[0];
        for(int i=1;i<n;i++) {
            exorAll ^= nums[i];
        }
        
        // Get the rightmost set bit
        exorAll = exorAll & ~(exorAll-1);
        
        // Divide array elements into two groups with that set bit
        for(int i=0;i<n;i++) {
            if((exorAll & nums[i]) > 0) result[0] ^= nums[i];
            else result[1] ^= nums[i];
            
        }
        
        return result;
            
        
    }
}