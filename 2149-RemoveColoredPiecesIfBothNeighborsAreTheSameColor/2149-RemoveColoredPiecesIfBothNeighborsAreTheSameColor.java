// Last updated: 10/11/2025, 11:02:42 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        int n=colors.length();
        int count1=0;
        int count2=0;
        for(int i=1;i<n-1;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A'){
                count1++;
            }
            if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B'){
                count2++;
            }

        }

        return count1>count2;
        
    }
}