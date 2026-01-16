// Last updated: 1/16/2026, 10:12:16 PM
class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr= Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(a,b)->{
            int ra= reflect(a);
            int rb= reflect(b);
            if(ra!=rb) return ra-rb;
            return a-b;
        });
        return Arrays.stream(arr).mapToInt(i->i).toArray();
    }
    private int reflect(int x){
        String s= new StringBuilder(Integer.toBinaryString(x)).reverse().toString();
        return Integer.parseInt(s,2);
    }
}