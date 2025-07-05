package array;

public class buyAndSellStocks {
    public static int stocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int n = prices.length;
        int maxProfit= 0;
        for(int i=0; i< n ; i++){
            if(buyPrice <  prices[i]){ //profit
                int profitt= prices[i] - buyPrice; //todays profit
                maxProfit= Math.max( maxProfit, profitt);
            } else{
                buyPrice=prices[i];
            }
        }
        return maxProfit; 
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,0};
       System.out.println( stocks(prices));
    }
}
