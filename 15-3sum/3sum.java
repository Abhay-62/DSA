class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //brute force approach is that make three loops i,j,k and then check and return 
      // now the approach is the 2 sum many times 
      int n=nums.length;
      Arrays.sort(nums);
      List<List<Integer>> result = new ArrayList<>();
      for(int i=0;i<n-2;i++){
        int left=i+1;
        int right=n-1;
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum ==(-nums[i])){
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                 while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }else if(sum>-nums[i]){
                right--;
            }else{
                left++;
            }
        }
      }
      return result;
        
      }  
    }