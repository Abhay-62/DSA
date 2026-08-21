class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[256];
        int low=0;
        int len;
        int maxcount=0;
        int diff;
        int result=0;
        for(int high=0;high<s.length();high++){
           char ch=s.charAt(high);
           arr[ch]++;
           len=high-low+1;
           maxcount=Math.max(maxcount,arr[ch]);
           diff=len-maxcount;
           while(diff>k){
           char sh=s.charAt(low);
            arr[sh]--;
            low++;
            maxcount=Math.max(maxcount,arr[sh]);
            len=high-low+1;
            diff=len-maxcount;

           }
           len=high-low+1;
           result=Math.max(result,len);


        }
        return result;
    }
}