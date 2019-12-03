import java.util.Scanner;

public class ClassExercise5_191023 {
    public static int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    public static int calculate1(int prices[]) {
        int len = prices.length, pro=0;
        if(len>1){
            int sta= prices[len-1];
            for(int i=len-1;i>0;i--){
                int end = prices[i-1];
                if(sta<end) pro = pro + sta-end;
            }
            return pro;
        }
        else return 0;
    }
    public static int calculate(int prices[], int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
//
        int max=maxProfit(num);
        System.out.println(max);
        input.close();
    }
}
