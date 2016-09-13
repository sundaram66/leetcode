public class Solution {
    public String largestNumber(int[] nums) {
        
                String[] inp = new String[nums.length];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = nums[i] + "";
        }

        Comparator<String> lexicographic =
                (String s1, String s2) -> {
                    String temp = s2;
                    s2 = s1 + s2;
                    s1 = temp + s1;
                    return s1.compareTo(s2);
                };

        Arrays.sort(inp, lexicographic);

        String result = "";
        boolean nonZero = false;
        for (String s : inp) {
            if(Integer.parseInt(s) > 0)
                nonZero = true;
            if(nonZero)
                result += s;
        }

        if(!nonZero) result = "0";
        
        return result;
    }
}