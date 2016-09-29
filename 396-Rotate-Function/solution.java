public class Solution {
    public int maxRotateFunction(int[] a) {
        
        int n = a.length;
        int firstVal = 0;
        int totalSum = 0;
       
        
        for(int i=0;i<n;i++) {
            firstVal += (i*a[i]);
            totalSum += a[i];
        }

        int max = firstVal;
        
        for(int i=1;i<=n;i++) {
            firstVal = firstVal- totalSum + (a[i-1]*n);
            max = Math.max(max,firstVal);
        }
        
        return max;
    }
}