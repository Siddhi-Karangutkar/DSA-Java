class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        for(int i = 1;i<n;i++){
           int diff =  prices[i]-min;
            if(diff >max){
                max = diff;
            }
            min =  Math.min(min,prices[i]);
        }
        return max;
    }
}
