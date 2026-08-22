class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> minheap=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minheap.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(nums[i]>minheap.peek()){
                minheap.poll();
                minheap.add(nums[i]);
            }
        }

        return minheap.peek();

        //QUICK SELECT ALGORITHM 
    //     int low=0;
    //     int high=nums.length-1;
    //     int target=nums.length-k;
    //     while(low<=high){
    //         int pivotIndex = partition(nums, low, high);
    //         if(target==pivotIndex){
    //             return nums[pivotIndex];
    //         }else if(target>pivotIndex){
    //             low=pivotIndex+1;
    //         }else{
    //             high=pivotIndex-1;
    //         }
    //     }
    //     return -1;
    // }

    //     public int partition(int[]nums,int low,int high){
    //       int pivot=nums[high];
    //         int i=low;
    //         for(int j=i;j<high;j++){
    //             if(nums[j]<=pivot){
    //                 int temp=nums[j];
    //                 nums[j]=nums[i];
    //                 nums[i]=temp;
    //                 i++;
    //             }

    //         }

    //         int temp=nums[i];
    //         nums[i]=nums[high];
    //         nums[high]=temp;

    //         return i;
        }
    
}