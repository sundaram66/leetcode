public class Solution {
    public int firstMissingPositive(int[] nums) {
       
       
    //     O(n) space solution 
    //     int n = nums.length;
    //     int[] res = new int[n];
        
    //     for(int i = 0;i<n;i++) {
    //         if(nums[i] > 0 && nums[i] <= n) {
    //             res[nums[i]-1] = -1;
    //         }
    //     }
    //     int j=0;
    //     for(j=0;j<n;j++) {
    //         if(res[j] == 0) return j+1;
    //     }
        
    //     return j+1;
    // }
    
    
    // Constant space solution
    
    
    int n = nums.length;
    
    for(int i=0;i<n;i++) {
        
         if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i]-1] ) {
             
             // 0 1 2 3 : 1 2 3 4 --> Proper arrangement here. If not proper, swap values;
             int temp = nums[nums[i]-1];
             nums[nums[i]-1] = nums[i] ;
             nums[i] = temp;
             i--;
             
         }
        
    }
    
    for(int j=0;j<n;j++) {
        if(nums[j] != j+1) 
            return j+1;
    }
    return n+1;
  }
}