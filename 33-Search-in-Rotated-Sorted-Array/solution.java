public class Solution {
    public int search(int[] a, int target) {
        
        int left = 0;
        int right = a.length-1;
        
        if(a[0] == target) return 0;
        
        while(left < right) {
            
            if(a[left] == target) return left;
            if(a[right] == target) return right;
            
            int mid = left+(right-left)/2;
            
            if(a[mid] == target) return mid;
            
            
            
            if(a[mid] > a[left]) { 
                if(a[mid] > target && target >= a[left])
                    right = mid-1;
                else
                   left = mid+1;
            }
            
            else {
                if(a[mid] < target && target <= a[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
            
        }
        
        return -1;
        
    }
}