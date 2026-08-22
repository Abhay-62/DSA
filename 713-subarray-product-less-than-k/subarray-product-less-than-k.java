class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low=0;
        int product =1;
        int len=0;
        if(k<=1){
            return 0;
        }
        for(int high=0;high<nums.length;high++){
            product*=nums[high];
            while(product>=k){
                product/=nums[low];
                low++;
            }
            len+=high-low+1;

        }
        return len;
    }
}