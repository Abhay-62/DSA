class Solution {
    public int countVowelStrings(int n) {
        int[] dp=new int[5];
        // for(int i=0;i<dp.length;i++){
        //     dp[i]=1;
        // } java 8 concept 

        Arrays.fill(dp,1);
        for(int i=2;i<=n;i++){
            int[] newdp=new int[5];
            for(int j=0;j<5;j++){
               for(int k=0;k<=j;k++){
                 newdp[j] += dp[k];
               }
                
               
               
            }
            dp=newdp;
        }
         


        return Arrays.stream(dp).sum();
        
    }
}