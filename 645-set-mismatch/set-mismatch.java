class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int duplicate=-1;
        int missing=-1;
        for(int i=0;i<nums.length;i++){
            int ch=nums[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            if(map.get(ch)==2){
               duplicate=ch;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!(map.containsKey(i))){
                 missing=i;
            }
        }

        return new int[]{duplicate,missing};
    }
}