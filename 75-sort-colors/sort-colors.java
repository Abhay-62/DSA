class Solution {
    public void sortColors(int[] nums) {
       //brute force approach make three new array store 0,1, and 2 and store them in new array 
    //    int zero[]=new int[nums.length];
    //    int one[]=new int[nums.length];
    //    int two[]=new int[nums.length];
    //    int result[]=new int[nums.length];
    //    int o=0;
    //    int t=0;
    //    int z=0;
    //   for(int i=0;i<nums.length;i++){
    //     if(nums[i]==0){
    //         zero[z]=nums[i];
    //         z++;
    //     }else if(nums[i]==1){
    //         one[o]=nums[i];
    //         o++;
    //     }else{
    //         two[t]=nums[i];
    //         t++;
    //     }
    //   }
    //   int index=0;
    //   for(int i=0;i<z;i++){
    //     nums[index]=zero[i];
    //     index++;
    //   }
    //   for(int i=0;i<o;i++){
    //     nums[index]=one[i];
    //     index++;
    //   }
    //   for(int i=0;i<t;i++){
    //     nums[index]=two[i];
    //     index++;
    //   }
 
 // second approach is the optimized brute force approach in which we one time traverse and count number of zero,one and two and then modify nums;
//  int z=0;
//  int o=0;
//  int t=0;
//  for(int i=0;i<nums.length;i++){
//     if(nums[i]==0){
//         z++;

//     }else if(nums[i]==1){
//         o++;
//     }else{
//         t++;
//     }
//  }
//  int index=0;
//  while(z>0){
//     nums[index]=0;
//     index++;
//     z--;
//  }
//   while(o>0){
//     nums[index]=1;
//     index++;
//     o--;
//  }
//  while(t>0){
//     nums[index]=2;
//     index++;
//     t--;
//  }
int mid=0;
int high=nums.length-1;
int low=0;
while(mid<=high){
    if(nums[mid]==0){
        swap(nums,low,mid);
        low++;
        mid++;
    }else if(nums[mid]==1){
        mid++;
    }else{
        swap(nums,high,mid);
        high--;
    }
}


     
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}