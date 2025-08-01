// Last updated: 8/1/2025, 11:56:53 AM
class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st= new Stack<>(); 
       return operation(st,tokens);
    }
    public static int operation(Stack<Integer> st,String[] tokens){
       for(int i=0;i<tokens.length;i++){
        if(tokens[i].equals("+")){
            int temp=st.pop();
            int ans=temp + st.pop();
            st.push(ans);
        }else if(tokens[i].equals("*")){
             int temp=st.pop();
             int ans=temp*st.pop();
             st.push(ans);
        }
        else if(tokens[i].equals("/")){
             int temp=st.pop();
             int ans=st.pop()/temp;
             st.push(ans);
        }else if(tokens[i].equals("-")){
             int temp=st.pop();
             int ans=st.pop()-temp;
             st.push(ans);
        }else{
            st.push(Integer.parseInt(tokens[i]));
        }
       }
       return st.peek();
    }
}