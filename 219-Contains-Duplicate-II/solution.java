public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> numbersMap = new HashMap<Integer,Integer>();
        int visitedIndex = 0;
        
        for(int i=0;i<nums.length;i++) {
            
            if(numbersMap.containsKey(nums[i])) {
                visitedIndex = numbersMap.get(nums[i]);
                if(i-visitedIndex <= k) 
                    return true;
            }
           
            numbersMap.put(nums[i],i);
            
        }
        return false;
        
    }
}