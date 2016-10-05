public class Solution {
    public int search(int[] A, int target) {
        
        if(A.length == 0) return -1;
        int l = 0, r = A.length-1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(A[m] == target) return m;
            if(A[l] < A[m] && A[m] < A[r]){
                if(target <= A[m]) r = m-1;
                else l = m+1;
            }
            else if(A[l] > A[m] && A[m] < A[r]){
                if(target < A[m]) r = m-1;
                else if(target <= A[r]) l = m+1;
                else r = m-1;
            }
            else{
                if(target > A[m]) l = m+1;
                else if(target >= A[l]) r = m-1;
                else l = m+1;
            }
        }
        return -1;
        
    }
}