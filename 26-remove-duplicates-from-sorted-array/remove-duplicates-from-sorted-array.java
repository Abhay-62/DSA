class Solution {
    public int removeDuplicates(int[] nums) {
       int k=1;//ye number of unique element fist wala humesha unique rahega
       int uniquepos=0;//ye us unique number ki position hai jab ye naya unique number find hoga to ye change ho jayegi 
       for(int i=1;i<nums.length;i++){
            if(!(nums[i]==nums[i-1])){
                k+=1;
                uniquepos++;
                nums[uniquepos]=nums[i];
            }

           
       }
       return k;
    }
}