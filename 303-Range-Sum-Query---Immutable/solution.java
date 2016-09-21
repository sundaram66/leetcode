public class NumArray {


    int[] result;
    public NumArray(int[] nums) {
        int n = nums.length;
        result = new int[n + 1];
        for(int i=1;i<=n;i++) {
            result[i] = result[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        
        return result[j+1]-result[i];
        
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);