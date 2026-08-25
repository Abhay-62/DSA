class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        
        int low=0;
        int high=k-1;
        int count=0;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
            
        }
       int  average=sum/k;

        while(high<arr.length){
           
            if(average>=threshold){

                count++;
                
            }
            sum=sum-arr[low];
                low++;
                high++;
                if(high<arr.length){
                       sum+=arr[high];
                }

            average=sum/k;
          
                
        }
        return count;
    }
}