public class Solution {
    public void moveZeroes(int[] a) {
        
        int n = a.length;
        if(n==0) return;
        
        int i=0,j=0;
        
        while(true) {
          
          while(i<n && a[i] != 0) { i++; }
          while(j<n && a[j] == 0) { j++; }
          
          
          
          if(i<n && j<n && i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
          }
          
          j++;
          
          if(j>=n) return;
          
          
          
          
          
        }
        
        
            
    
        
    }
}