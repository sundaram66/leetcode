public class Solution {
    public int lastRemaining(int n) {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        
        for(int i=2;i<=n;i+=2) {
            st1.push(i);
        }
        
        while(true) {
        if(st1.size() == 1) return st1.pop();
        
        while(!st1.isEmpty()) {
            st1.pop();
            if(!st1.isEmpty()) st2.push(st1.pop());
        }
        
        if(st2.size() == 1) return st2.pop();
        
        while(!st2.isEmpty()) {
            st2.pop();
            if(!st2.isEmpty()) st1.push(st2.pop());
        }
        }
    }
}