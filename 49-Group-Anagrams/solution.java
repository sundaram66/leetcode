public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       int[] a = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
       List<List<String>> resultList = new ArrayList<List<String>>();
       Map<Integer,List<String>> map  = new HashMap<Integer,List<String>>();

       for(int i=0;i<strs.length;i++) {
           String s = strs[i];
           int hashCode = 1;
           for(int j=0;j<s.length();j++) {
               hashCode = hashCode * a[s.charAt(j)-'a'];
           }
           List<String> existing = map.get(hashCode);
           if(existing == null) {
               existing = new ArrayList<String>();
           }
           existing.add(s);
           map.put(hashCode,existing);
       }

       Iterator<Map.Entry<Integer, List<String>>> iterator = map.entrySet().iterator();
       while(iterator.hasNext()) {
           resultList.add(iterator.next().getValue());
       }
       
       return resultList;
        
    }
}