public class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = 0,fast = 0;;
        
        // Find if duplicate
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        // Detect starting point.. ie.., duplicate number
        slow = 0;
        while(slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
            if(slow == fast)
                break;
        }
        
        return slow;
        
    }
}