class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int result=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char sh=s.charAt(low);
                map.put(sh,map.get(sh)-1);
                if(map.get(sh) == 0) {
                    map.remove(sh);
                }
             low++;
            }
            int len=high-low+1;
            result=Math.max(result,len);

        }
        return result;
    }
}