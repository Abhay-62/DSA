class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low=0;
        int high=nums.length-1;
       while(low<nums.length-1 && nums[low]<=nums[low+1]){
        low++;
       }
       if(low==nums.length-1){
        return 0;
       }
       while(high>0 && nums[high]>=nums[high-1]){
        high--;;
       }
       int smax=Integer.MIN_VALUE;
       int smin=Integer.MAX_VALUE;
       for(int i=low;i<=high;i++){
        smax=Math.max(smax,nums[i]);
        smin=Math.min(smin,nums[i]);
       }

       while(low>0 && nums[low-1]>smin){
        low--;
       }
       while(high<nums.length-1 && nums[high+1]<smax){
        high++;
       }

       int ans=high-low+1;
       return ans;
    }
}