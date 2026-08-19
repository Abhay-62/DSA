class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int profit;
        for(int i=0;i<prices.length;i++){
           buyprice=Math.min(buyprice,prices[i]);
           if(buyprice<prices[i]){
            profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);

           }else{
            buyprice=prices[i];
           }
        }

        return maxprofit;
    }
}