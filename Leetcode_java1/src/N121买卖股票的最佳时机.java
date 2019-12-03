public class N121买卖股票的最佳时机 {
    public static  int maxProfit(int[] prices) {
        int maxPro=0, tempPro=0;
        int tempmin=-1, len=prices.length;
        for(int i=0;i<len;i++){
            if(tempmin==-1)tempmin = prices[i];
            if(prices[i]>tempmin) tempPro=prices[i]-tempmin;
            else if(prices[i]<tempmin) tempmin=prices[i];
            if(tempPro>maxPro)maxPro=tempPro;
        }
        return maxPro;
    }
    public static void main(String[] s) {
        int[] test={7, 6, 4, 3, 1};
        System.out.println(maxProfit(test));
    }
}
