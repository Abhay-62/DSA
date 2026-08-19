class Solution {
    public int search(int[] nums, int target) {
        //binary search 
        // 1.binary search mid find 
        // 2.check if mid== target
        // 3.check left half is sorted - then if target lies in left half-high=mid-1
        //                                    else low=mid+1
        // 4. else right half is sorted then same step

        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }

            //left half sorted
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                  right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
                  left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
       return -1;
    }
}