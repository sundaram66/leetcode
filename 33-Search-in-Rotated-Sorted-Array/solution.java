public class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (nums[low] < nums[high - 1]) {
                if (target > nums[mid]) low = mid + 1;
                else if (target < nums[mid]) high = mid;
                else return mid;
            } else {
                if (nums[mid] >= nums[low]) {
                    if (target > nums[mid]) low = mid + 1;
                    else if (target < nums[mid])
                        if (target >= nums[low]) high = mid;
                        else if (target <= nums[high - 1]) low = mid + 1;
                        else return -1;
                    else return mid;
                } else if (nums[mid] <= nums[low]) {
                    if (target < nums[mid]) high = mid;
                    else if (target > nums[mid])
                        if (target <= nums[high - 1]) low = mid + 1;
                        else if (target >= nums[low]) high = mid;
                        else return -1;
                    else return mid;
                }
            }
        }
        return -1;
        
    }
}