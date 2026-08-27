class Solution {
    public boolean validPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        int count=0;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return check(s,low+1,high)|| check(s,low,high-1);
            }
            low++;
            high--;

        }
        

        return true;
    }

    public boolean check(String s ,int low, int high){
        
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
}