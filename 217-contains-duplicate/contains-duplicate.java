class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    HashMap <Integer,Integer> map=new HashMap<>();
    
    //    for(int i=0;i<nums.length;i++){
    //     int ch=nums[i];
    //     map.put(ch,map.getOrDefault(nums,0)+1);
    //    }
    //    if(map.size()==nums.length){
    //      return false;
    //    }else{
    //     return true;

    //    }
      // also use hash set
      HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
          if(set.contains(nums[i])){
            return true;
          }
          set.add(nums[i]);
       }
        return false;
    }
   
}