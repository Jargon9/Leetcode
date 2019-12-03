import java.util.Arrays;

public class N322_零钱兑换 {
    public static int coinChange(int [] coins, int amount){
        int len=coins.length;
        if(amount==0)return 0;
        if(len<=0||amount<0)return -1;
        Arrays.sort(coins);


        int[] dp=new int[amount+1];
        for(int i=0;i<amount+1;i++){
            dp[i]=-1;
        }
        for(int i=0;i<amount+1;i++){
            for(int j=0;j<len;j++){
                if(i>=coins[j]) {
                    if(dp[i]==-1&&dp[i - coins[j]]!=-1){
                        dp[i]= dp[i - coins[j]]+1;
                    }
                    else if(dp[i]!=-1&&dp[i - coins[j]]!=-1) {
                        dp[i]= Math.min(dp[i], dp[i - coins[j]]+1);
                    }
                    if (i == coins[j]) dp[i]=1;
                }
                else break;
            }
        }
        return dp[amount];
    }
    public static void main(String[] args){
        int[] coins ={ 186,419,83,408};
        System.out.println(coinChange(coins, 6249));
    }
}
