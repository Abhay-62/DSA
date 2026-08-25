class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int low=0;
        // int maxvalue=Integer.MIN_VALUE;
        // int minvalue=Integer.MAX_VALUE;
        Deque<Integer> maxdeque=new ArrayDeque<>();
        Deque<Integer> mindeque=new ArrayDeque<>();
        int result=0;
        for(int high=0;high<nums.length;high++){
            // for(int i=low;i<=high;i++){
            //   maxvalue=Math.max(nums[i],maxvalue);
            //   minvalue=Math.min(nums[i],minvalue);
            // } WE WILL NOT USE THIS TO FIND THE MAXIMUM AND MINIMUM BEACAUSE TWO
            //LOOPS WILL EXECUTE AND IT WILL INCREASE THE TIME COMPLEXITY SO WE USE DEQUE 
            while(!maxdeque.isEmpty() && nums[maxdeque.peekLast()]<nums[high]){
                 maxdeque.removeLast();
            }
            maxdeque.addLast(high);

            while(!mindeque.isEmpty() && nums[mindeque.peekLast()]>nums[high]){
                mindeque.removeLast();
            }
            mindeque.addLast(high);

            while(nums[maxdeque.peekFirst()]-nums[mindeque.peekFirst()]>limit){
                if(maxdeque.peekFirst()==low){
                    maxdeque.removeFirst();
                }

                if(mindeque.peekFirst()==low){
                    mindeque.removeFirst();
                }

                low++;
            }

             result = Math.max(result, high - low + 1);
        } 

        return result;
    }
}