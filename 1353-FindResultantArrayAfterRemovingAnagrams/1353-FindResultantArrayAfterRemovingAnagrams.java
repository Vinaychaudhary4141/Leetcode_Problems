// Last updated: 11/26/2025, 12:59:48 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        for(int i=1;i<list.size();i++){
            if(isAnagrams(i,list)){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    private boolean isAnagrams(int i, List<String> words){
        String prev= words.get(i-1);
        String curr=words.get(i);
        char[] p = prev.toCharArray();
        char[] c = curr.toCharArray();
        Arrays.sort(p);
        Arrays.sort(c);
        if(Arrays.equals(p,c)){
            return true;
        }else{
            return false;
        }
    }
}