class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

       // so we can do by travesring into nums and make three new list less,equal and greater then add into result array ;
       int[] ans=new int[nums.length];
       int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<pivot){
            ans[index++]=nums[i];
        }
       }
          for(int i=0;i<nums.length;i++){
        if(nums[i]==pivot){
            ans[index++]=nums[i];
        }
       }
          for(int i=0;i<nums.length;i++){
        if(nums[i]>pivot){
            ans[index++]=nums[i];
        }
       }

        return ans;
    }
}