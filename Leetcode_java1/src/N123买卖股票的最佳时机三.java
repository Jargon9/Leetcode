public class N123买卖股票的最佳时机三 {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if(len==2){
            if(prices[1]-prices[0]>0)
                return prices[1]-prices[0];
        }
        if(len>2){
            int[] front = new int[len+1];
            int[] end = new int[len+1];
            int Fmin = prices[0];
            int Emax = prices[len-1];
            for(int i=1;i<len;i++){
                if(prices[i]>Fmin){
                    front[i] = Math.max(front[i-1], prices[i]-Fmin);
                }else if(prices[i]<Fmin){
                    front[i] = front[i-1];
                    Fmin = prices[i];
                }
                if(prices[len-i-1]<Emax){
                    end[len-i-1]=Math.max(end[len-i], Emax - prices[len-i-1]);
                }else{
                    end[len-i-1] = end[len - i];
                    Emax = prices[len-i-1];
                }
            }
            Emax = -1;
            for(int i=1;i<len-1;i++){
                front[i] = front[i] + end[i];
                if(Emax<front[i]) Emax = front[i];
            }
            return Emax;
        }
        return 0;
    }
    public static void  main(String[] args){
        int[] test = {1,2};
        System.out.println(maxProfit(test));
    }
}
