import java.util.Collections;

public class N416分割等和子集 {
    public static boolean canPartition(int[] nums) {
        int len = nums.length, sum=0, ResSum=0;
        for(int i=0;i<len;i++){
            sum = sum + nums[i];
        }
        ResSum = sum / 2;
        if(ResSum%2==1)return false;
        boolean[] dp = new boolean[ResSum+1];
        dp[0] = true;
        for(int temp:nums){
            for(int i=ResSum;i>=temp;i--){
                dp[i] = dp[i] || dp[i-temp];
            }
        }
        return dp[ResSum];
    }
    public static void main(String []args){
        int[] s = {1, 5, 11 ,5};
        canPartition(s);
    }

}

