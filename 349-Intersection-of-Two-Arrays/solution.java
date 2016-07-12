public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> visitedMap = new HashMap<Integer,Integer>();
        List<Integer> arrList = new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++) {
            visitedMap.put(nums1[i],1);
        }

        for(int i=0;i<nums2.length;i++) {
            if(visitedMap.containsKey(nums2[i])) {
                arrList.add(nums2[i]);
                visitedMap.remove(nums2[i]);
            }
        }

        return arrList.stream().mapToInt(i->i).toArray();
        
    }
}