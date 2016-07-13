public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> numberSet = new HashSet<>();
        
        for(int i=0;i<nums.length;i++) {
            if(numberSet.contains(nums[i]))
                return true;
            numberSet.add(nums[i]);
        }
        
        return false;
        
        
    }
}