// Last updated: 8/1/2025, 11:56:11 AM
class Solution {
    public int findNumbers(int[] arr) {
       
        int count=0;
        for(int i =0;i<arr.length;i++){
            int length = String.valueOf(arr[i]).length();
            if(length%2==0){
                count++;
            }
        }
         return count;
        
    }
}