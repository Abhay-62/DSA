
class Solution {
    public int[] sortedSquares(int[] nums) {
        // int square[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     square[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(square);
        // return square; brute force approach in which we make ne array of squares and then sort tc=nlogn

        //two merge sorted array
//         List<Integer> a = new ArrayList<>(); //positive numbers
//         List<Integer>  b = new ArrayList<>();// negative numbers 
//         int ans[]=new int[nums.length];

//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>=0){
//                 a.add(nums[i]);
//             }else{
//                 b.add(nums[i]);
//             }
//         }
        

//        for (int i = 0; i < a.size(); i++) {
//             a.set(i, a.get(i) * a.get(i));
//        }
//         for (int i = 0; i < b.size(); i++) {
//             b.set(i, b.get(i) * b.get(i));
//         } 

//         Collections.reverse(b);
//         int i=0;
//         int j=0;
//         int k=0;

//         while(i<a.size() && j<b.size()){
//             if(a.get(i)<=b.get(j)){
//                 ans[k++]=a.get(i++);
//             }else{
//                 ans[k++]=b.get(j++);
//             }
//         }

//         while(i<a.size()){
//             ans[k++]=a.get(i++);
//         }
//          while(j<b.size()){
//             ans[k++]=b.get(j++);
//         }
        
            
    


//   return ans;

// two pointer optimize approach 
int ans[]=new int[nums.length];
int n=nums.length;
  int i=0;
  int j=n-1;
  int k=n-1;
  while(i<=j){
    if((nums[i]*nums[i])>=(nums[j]*nums[j])){
        ans[k]=nums[i]*nums[i];
        i++;
        k--;
    }else{
         ans[k]=nums[j]*nums[j];
        j--;
        k--;
    }
  }

  return ans;
    }
}