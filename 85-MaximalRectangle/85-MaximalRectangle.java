// Last updated: 8/1/2025, 11:57:09 AM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int arr[] = new int[matrix[0].length];
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == '0'){
                    arr[j] = 0;
                }else{
                    arr[j]++;
                }
            }
            ans = Math.max(ans,largest_his(arr));
        }
        return ans;
    }
    public static int largest_his(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                int h = arr[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    ans =  Math.max(h*r,ans);
                }else{
                    int l = st.peek();
                    int area = h*(r - l -1);
                    ans = Math.max(area,ans);
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty() ){
            int h = arr[st.pop()];
            if(st.isEmpty()){
                ans =  Math.max(h*r,ans);
            }else{
                int l = st.peek();
                int area = h*(r - l -1);
                ans = Math.max(area,ans);
            }
        }
       return ans;
    }
}