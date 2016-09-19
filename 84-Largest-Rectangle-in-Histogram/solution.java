public class Solution {
    public int largestRectangleArea(int[] a) {
        
        int n = a.length;
        if(n == 0)
            return 0;
        
        int min = a[0],maxVal = a[0];
        int area = 0;
        
        for(int i=0;i<n;i++) {
            if(maxVal < a[i]) {
                maxVal = a[i];
            }
            min = a[i];
            
            for(int j=i+1;j<n;j++) {
                if(min > a[j]) {
                    min = a[j];
                }
                area = min * (j-i+1);
                if(maxVal < area)
                    maxVal = area;
            }
            
        }
        
        return maxVal;
        
    }
}