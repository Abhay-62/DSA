class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int result[]=new int[m+n];
        // int k=0;
        // int i=0;
        // int j=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         result[k++]=nums1[i++];
        //     }else{
        //         result[k++]=nums2[j++];
        //     }
            
        // }

        // while(i<m){
        //     result[k++]=nums1[i++];
        // }
        // while(j<n){
        //     result[k++]=nums2[j++];
        // }

        // for(int a=0;a<result.length;a++){
        //     nums1[a]=result[a];
        // }

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
}