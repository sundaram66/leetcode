public class Solution {
    public int largestRectangleArea(int[] a) {
        
        // O(n^2) Solution
        
        // int n = a.length;
        // if(n == 0)
        //     return 0;
        
        // int min = a[0],maxVal = a[0];
        // int area = 0;
        
        // for(int i=0;i<n;i++) {
        //     if(maxVal < a[i]) {
        //         maxVal = a[i];
        //     }
        //     min = a[i];
            
        //     for(int j=i+1;j<n;j++) {
        //         if(min > a[j]) {
        //             min = a[j];
        //         }
        //         area = min * (j-i+1);
        //         if(maxVal < area)
        //             maxVal = area;
        //     }
            
        // }
        
        // return maxVal;
        
        // O(n)
        
        if (a.length == 0) {
            return 0;
        }
        
        Stack<Integer> st = new Stack<Integer>();
        int max = 0;
        for (int i = 0; i <= a.length; i++) {
            int currHeight = (i == a.length) ? 0 : a[i]; 
            
            while (!st.isEmpty() && currHeight <= a[st.peek()]) {
                int h = a[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek() -1;
                max = Math.max(max, h * w);
            }
            
            // Increasing heights in stack...
            st.push(i);
        }
        return max;
    }
}