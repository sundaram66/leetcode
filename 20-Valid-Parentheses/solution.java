public class Solution {
    public boolean isValid(String exp) {
        
        if(exp == null) return true;
 
		Stack<Character> st = new Stack<Character>();
 
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if( c == '{' || c == '[' || c == '(') {
				st.push(c);
			}
			else {
				if(st.isEmpty()) return false;
				char top = st.pop(); //Exception if given input }}} -> not valid
				if(c == '}') {
					if(top != '{') return false;
 
				}
				else if(c == ')') {
					if(top != '(') return false;
				}
				else if(c == ']') {
					if(top != '[') return false;
				}
			}
		}
		if(!st.isEmpty()) return false; 
		return true;
	} 
}