public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer> numbersMap = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++) {
            if(numbersMap.containsKey(nums[i]))
                return true;
            numbersMap.put(nums[i],1);
        }
        
        return false;
        
        
    }
}