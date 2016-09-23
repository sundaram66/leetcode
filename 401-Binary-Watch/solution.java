public class Solution {
    public List<String> readBinaryWatch(int num) {
        
        List<String> result = new ArrayList<String>();
        
        for(int i=0;i<=11;i++) {
            for(int j=0;j<=59;j++) {
                int hr = get1s(i);
                int min = get1s(j);
                
                if(hr + min == num) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i +":");
                    if(j < 10) {
                        sb.append("0");
                    }
                    sb.append(j);
                    result.add(sb.toString());
                }
            }
        }
        return result;
    }
    
    public int get1s(int n) {
        
        int cnt = 0;
        while(n > 0) {
            cnt++;
            n &= (n-1);
        }
        return cnt;
    }
    
}