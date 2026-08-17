class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int low=0;
        double sum=0;
        int high=k-1;
        for(int i=low;i<=high;i++){
            sum+=nums[i];
            
        }
        double average=sum/k;
        double result=average;

        while(high<nums.length){
            low++;
            high++;
            result=Math.max(result,average);
            if(high==nums.length){
                break;
            }
            sum=sum-nums[low-1]+nums[high];
            average=sum/k;
        }

        return result;
    }
}