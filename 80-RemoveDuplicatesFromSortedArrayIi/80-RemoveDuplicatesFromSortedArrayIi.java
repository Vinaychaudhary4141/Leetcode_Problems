// Last updated: 8/1/2025, 11:57:12 AM
class Solution {
    public int removeDuplicates(int[] arr) {
     if(arr.length<=2){
        return arr.length;
     }
     int k=2;
     for(int i=2;i<arr.length;i++){
        if(arr[k-2]!=arr[i]){
            arr[k]=arr[i];
            k++;
        }
     }
     return k;

    }
}