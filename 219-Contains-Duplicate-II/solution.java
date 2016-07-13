public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
       /* 
       HashMap Solution : O(n) time, O(n) space
       
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
        return false;*/
     
        int len = nums.length;
        
        for(int i=0;i<len;i++) {
            
            int j = i+k;
            
            if(j >= len) 
                j = len - 1;
            
            while(j > i) {
                
                if(nums[i] == nums[j]) 
                    return true;
                j--;
                
            }
            
        }
        
        return false;
        
    }
}