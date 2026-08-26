class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int low=0;
        String result="";
        int one=0;
        int minlen=Integer.MAX_VALUE;

        for(int high=0;high<s.length();high++){
            if(s.charAt(high)=='1'){
                one++;
            }

            while(one==k){
                int len=high-low+1;
                
                String current=s.substring(low,high+1);
                if(len<minlen){
                    minlen=len;
                    result=current;
                }else if(len==minlen && current.compareTo(result)<0){
                    result=current;
                }
                 if (s.charAt(low) == '1') {
                    one--;
                }

                low++;

            }
        }

        return result;
        
    }

   
}