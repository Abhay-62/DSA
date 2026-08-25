class Solution {
    public int maxVowels(String s, int k) {
     int low=0;
     
     int count=0;
     int max=Integer.MIN_VALUE;
     for(int high=0;high<s.length();high++){
        if(isvowel(s.charAt(high))){
            count++;
        }

        if((high-low+1)>k){
            if (isvowel(s.charAt(low))) {
                    count--;
                }
            low++;
        }

        if((high-low+1)==k){
            max=Math.max(max,count);
        }

        
     }
     return max;
    }

     public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
     }
}