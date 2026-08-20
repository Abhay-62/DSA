class Solution {
    public void nextPermutation(int[] nums) {
        
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;  //checking if there is any pivot so if pivot found it will break 
        }

        if(i>=0){
            int z=nums.length-1;
            while(z>=i+1 && nums[z]<=nums[i]){
                z--; //check if there is any number to swap if there will be number then it will stop the loop
            }
            int temp=nums[i];
            nums[i]=nums[z];
            nums[z]=temp;
        }

        // part to reverse the right part use two pointer 
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}