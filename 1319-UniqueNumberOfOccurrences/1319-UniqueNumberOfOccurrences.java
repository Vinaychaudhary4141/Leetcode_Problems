// Last updated: 9/21/2025, 7:55:59 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer, Integer> map= new HashMap<>();
       for(int i=0; i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       } 
       HashSet<Integer> set= new HashSet<>();
        for (int freq : map.values()) {
            if (!set.add(freq)) {
                return false; 
            }
        }
    return true;
    }
}