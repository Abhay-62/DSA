class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //frequecies of charcter in s1 will be equal to s2 
        // question is of fixed sliding window 
        int sfeq[]=new int[256];
        int tfeq[]=new int[256];
        int low=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            sfeq[ch]++;
        }
      for(int high=0;high<s2.length();high++){
        char sh=s2.charAt(high);
        tfeq[sh]++;
       if((high-low+1)>s1.length()){
           char remove=s2.charAt(low);
           tfeq[remove]--;
           low++;
       }
       if((high-low+1)==s1.length()){
            if(sahi(tfeq,sfeq)){
                return true;
            }
       }
      
      }
        
     return false;
    }
    public boolean sahi(int[] tfeq,int[] sfeq){
        for(int i=0;i<256;i++){
            if(sfeq[i]!=tfeq[i]){
                return false;
            }
        }
        return true;
    }
}