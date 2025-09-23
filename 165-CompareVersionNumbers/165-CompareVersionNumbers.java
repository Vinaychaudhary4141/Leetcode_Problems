// Last updated: 9/23/2025, 6:08:47 PM
class Solution {
    public int compareVersion(String version1, String version2) {
       String[] parts = version1.split("\\."); 
       ArrayList<Integer> arr1 = new ArrayList<>();

       for (String p : parts) {
             arr1.add(Integer.parseInt(p));  
        }
        String[] part = version2.split("\\.");  
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (String p : part) {
            arr2.add(Integer.parseInt(p));  
        }
        int n = Math.max(arr1.size(), arr2.size());

        for (int i = 0; i < n; i++) {
            int num1 = i < arr1.size() ? arr1.get(i) : 0;
            int num2 = i < arr2.size() ? arr2.get(i) : 0;

            if (num1 < num2) return -1;
            else if (num1 > num2) return 1;
        }

     return 0;
    }
}