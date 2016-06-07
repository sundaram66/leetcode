public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int n = nums.length;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++) {
            
            if(map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            
            map.put(target-nums[i], i);
            
            
        }
        
        return result;
    }
}