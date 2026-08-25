class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }

    public int atmost(int[] nums,int k){
        int low=0;
        int count=0;
         HashMap <Integer,Integer> map=new HashMap<>();
        for(int high=0;high<nums.length;high++){
           
            int sh=nums[high];
            map.put(sh,map.getOrDefault(sh,0)+1);
            while(map.size()>k){
                int ch=nums[low]; 
                 map.put(ch,map.getOrDefault(ch,0)-1);
                  if(map.get(ch)==0){
                    map.remove(ch);
                 }
                 low++;
                
            }
            count+=high-low+1;
        }
        return count;
    }
}