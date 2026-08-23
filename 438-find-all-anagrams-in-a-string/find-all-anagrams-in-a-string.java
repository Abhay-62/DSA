class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pfeq=new int[256];
        int[] sfeq=new int[256];
        int low=0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            pfeq[ch]++;
        }

        for(int high=0;high<s.length();high++){
            char sh=s.charAt(high);
            sfeq[sh]++;
            if((high-low+1)>p.length()){
                sfeq[s.charAt(low)]--;
                low++;
            }
            if((high-low+1)==p.length()){
               if(sahi(sfeq,pfeq)){
                  // i want to return the index of low;
                  result.add(low);
               }
            }
        }
        return result;
    }

    public boolean sahi(int[] sfeq,int[] pfeq){
        for(int i=0;i<256;i++){
            if(sfeq[i]!=pfeq[i]){
                return false;
            }
        }
        return true;
    }
}