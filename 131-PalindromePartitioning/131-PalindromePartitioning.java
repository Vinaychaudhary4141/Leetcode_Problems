// Last updated: 8/1/2025, 11:56:59 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>ll=new ArrayList<>();
        PalindromePartitioning(s,"",res,ll);
        return res;
    }
    public static void PalindromePartitioning(String ques,String ans, List<List<String>>res,List<String>ll)
    {
        if(ques.length()==0)
        {
            res.add(new ArrayList<>(ll));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++)
        {
            String s=ques.substring(0,cut);
            if(isPlaindrome(s)){
            ll.add(s);
            PalindromePartitioning(ques.substring(cut),ans+s+"|",res,ll);
            ll.remove(ll.size()-1);
        }
        }
    }
    public static boolean isPlaindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}