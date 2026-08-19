class Solution {
    public int maxSubArray(int[] nums) {
        // int largest=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=nums[k];

        //         }
        //         if(sum>largest){
        //             largest=sum;
        //         }
        //     }
        // }

        // return largest; brute force approach 

        //prefix sum approach

        // int largest=Integer.MIN_VALUE;
        // int prefixarr[]=new int[nums.length];
        // prefixarr[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     prefixarr[i]=prefixarr[i-1]+nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //        int currsum=i==0?prefixarr[j]:prefixarr[j]-prefixarr[i-1];

        //         if(currsum>largest){
        //             largest=currsum;
        //         }
        //     }
        // }

        // return largest;

//kadanes algorithm
// int cs=0;
// int ms=Integer.MIN_VALUE;
// int count=0;
// for(int i=0;i<nums.length;i++){
//    if(nums[i]<0){
//     count++;
//    }
// }
// if(count==nums.length){
//     for(int i=0;i<nums.length;i++){
//       ms=Math.max(nums[i],ms);
// }
// }else{
//     for(int i=0;i<nums.length;i++){
//     cs+=nums[i];
//     if(cs<0){
//         cs=0;
//     }
//  ms=Math.max(cs,ms);
// }
// }

//kadane's algorithm we put in correct order we dont have to write extra logic 
int cs=0;
int ms=Integer.MIN_VALUE;
int count=0;

    for(int i=0;i<nums.length;i++){
    cs+=nums[i];
    // if(cs<0){
    //     cs=0;
    // }change the order
 ms=Math.max(cs,ms);
 if(cs<0){
        cs=0;
    }

}


    return ms;    
    }
}