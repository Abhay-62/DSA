class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int maxvalue=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==target){
                    result=sum;;
                    left++;
                    right--;
                    return result;
                }else if(sum>target){
                    if(Math.abs(sum-target)<Math.abs(result-target)){
                        result=sum;
                    }
                    right--;
                    
                }else{
                  if(Math.abs(sum-target)<Math.abs(result-target)){
                        result=sum;
                        
                    }
                  
                    left++;  
                }
            }
        }
        return result;
    }
}