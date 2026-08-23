class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atmost(nums,goal)-atmost(nums,goal-1);
    }

    public int atmost(int[] nums,int goal){
         int low=0;
        int count=0;
        int sum=0;
        if(goal<0){
            return 0;
        }
        for(int high=0;high<nums.length;high++){
            sum+=nums[high];
            while(sum>goal){
                sum-=nums[low];
                low++;
            }
           
        count+=high-low+1;
          
        }
        return count;
    }
}