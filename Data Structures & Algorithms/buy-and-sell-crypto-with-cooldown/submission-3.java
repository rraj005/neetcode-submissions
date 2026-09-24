class Solution {
    public int maxProfit(int[] prices) {
        
       
        int hold = -prices[0];
        int sold =0;
        int cool =0;



        for(int i=1; i<prices.length; i++) {

            int prevHold = hold;
            int prevSold = sold;
            int prevCool = cool;
                
            

            hold = Math.max( hold, prevCool - prices[i]);

            sold = prevHold + prices[i];
            
            cool = Math.max( prevCool, prevSold);

        }


        return Math.max(sold, cool);
        
    }
}
