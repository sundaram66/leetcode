public class Solution {
    public int calculate(String s) {
        
        int len = s.length();
        
        if(s== null || len == 0)
            return 0;
            
        Stack<Integer> st = new Stack<Integer>();
        int positive = 1;
        int result = 0;
        st.push(1);
        
        for(int i=0;i<len;i++) {
            
            char c = s.charAt(i);
            
            if(c == '-') 
                positive = -1;
            
            else if(c == '+') 
                positive = 1;
            
            else if(c == '(')  {
                st.push(st.peek() * positive);
                positive = 1;
            }
            else if(c == ')') 
                st.pop();
            
            else if(Character.isDigit(c)) {
                
                int currNo = 0;
                while(i<len && Character.isDigit(s.charAt(i))) {
                    currNo = currNo * 10 + s.charAt(i)-'0';
                    i++;
                }
                i--;
                result += positive * currNo * st.peek();
            }
        }
        
        return result;
        
    }
}