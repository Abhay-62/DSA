class Solution {
    public long countSubarrays(int[] nums, long k) {
        int low=0;
        long count=0;
        long sum=0;
        for(int high=0;high<nums.length;high++){
            sum+=nums[high];
            int len=high-low+1;
            long score=sum*len;
            while(score>=k){
                sum=sum-nums[low];
                low++;
                len=high-low+1;
                score=sum*len;
               
            }
            count+=high-low+1;
        }
        return count;
    }
}