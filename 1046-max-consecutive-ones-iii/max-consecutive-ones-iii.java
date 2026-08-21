class Solution {
    public int longestOnes(int[] nums, int k) {
        // HashMap <Integer,Integer> map=new HashMap<>();
        // int low=0;
        // int result=0;
        // for(int high=0;high<nums.length;high++){
        //     int ch=nums[high];
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        //     while(map.getOrDefault(0,0)>k){
        //         int sh=nums[low];
        //         map.put(sh,map.getOrDefault(sh,0)-1);
        //         if(map.get(sh)==0){
        //             map.remove(sh);
        //         }
        //         low++;
        //     }
        //     int len=high-low+1;
        //     result=Math.max(result,len);
        // }

        // return result;

        int low=0;
        int zerocount=0;
        int result=0;
        for(int high=0;high<nums.length;high++){
            if(nums[high]==0){
                zerocount++;
            }

            while(zerocount>k){
                if(nums[low]==0){
                    zerocount--;
                }
                low++;
            }

            int len=high-low+1;
            result=Math.max(result,len);

        }
        return result;
    }
}