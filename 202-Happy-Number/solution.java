public class Solution {
    public boolean isHappy(int num) {

        Map<Integer,Integer> numbers = new HashMap<>();


        if(num == 1) return true;
        int sum = 0;

        while(num > 0) {
            int digit = num%10;
            sum += digit * digit;
            num = num/10;

            if(num == 0) {

                if (sum == 1) return true;

                // To avoid loop indefinite, put calculated sum in a map, if same sum return false.
                if (numbers.containsKey(sum)) {
                    return false;
                } 
                else
                        numbers.put(sum, 1);
                        
                        
                        
                num = sum;
                sum = 0;

                
            }

        }

        return false;
    }
}