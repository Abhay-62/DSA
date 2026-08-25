class Solution {
    public int minOperations(int[] nums, int x) {
       // find the longest subarray whose sum is total-x;
       int total=0;
       int sum=0;
       int low=0;
       int result=-1;
       for(int i=0;i<nums.length;i++){
        total+=nums[i];
       }
       if(total-x<0){
        return -1;
       }
       for(int high=0;high<nums.length;high++){
         
         sum+=nums[high];
         while(sum>total-x){
            sum-=nums[low];
            low++;
         }

         if(sum==total-x){
            int len=high-low+1;
            result=Math.max(len,result);
         }

         //minimum operation = total length-longest subarray
         
       }
       if(total-x==0){
        return nums.length;
       }

       return result==-1?-1:nums.length-result;
    }
}