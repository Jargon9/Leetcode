public class ClassExercise3_191023 {
    public static int maxProfit(int[] prices) {
        return calculate1(prices);
    }

    public static int calculate1(int prices[]) {
        int len = prices.length, pro=0;
        if(len>1){
            int sta= prices[len-1];
            for(int i=len-1;i>0;i--){
                int end = prices[i-1];
                sta = prices[i];
                if(sta>end) pro = pro + sta-end;
            }
            return pro;
        }
        else return 0;
    }
    public static void main(String[] s) {
        int[] S={7,1,5,3,6,4};
        System.out.println(maxProfit(S));


    }
}
