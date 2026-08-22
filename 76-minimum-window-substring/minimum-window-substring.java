class Solution {
    public String minWindow(String s, String t) {
        int tfeq[]=new int[256];
        int sfeq[]=new int[256];
        int low=0;
        int start=0;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tfeq[ch]++;
        }
        for(int high=0;high<s.length();high++){
            char sh=s.charAt(high);
            sfeq[sh]++;
            while(sahi(tfeq,sfeq)){
                int len=high-low+1;
                if(result>len){
                    result=len;
                    start=low;
                }
                sfeq[s.charAt(low)]--;
                low++;
            }
        }
        if(result==Integer.MAX_VALUE){
            return "";
        }

         return s.substring(start,start+result);
    }

    public boolean sahi(int[] tfeq,int[] sfeq){
        for(int i=0;i<256;i++){
            if(sfeq[i]<tfeq[i]){
                return false;
            }
        }
        return true;
    }
}