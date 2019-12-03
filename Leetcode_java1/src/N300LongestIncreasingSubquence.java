import java.util.Arrays;

public class N300LongestIncreasingSubquence {
    public static int lengthOfLIS1(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] dp = new int[len];
        int[] temp=new int[len];
        dp[0] = 1;
        temp[0]=nums[0];
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i - 1];
            if (nums[i] > max) {
                dp[i] = dp[i - 1] + 1;
                max = nums[i];
                temp[i]=max;
            } else {
                int res = dp[i - 1];
                for (int j = 0; j < i; j++) {
                    if (nums[i] > temp[j]) {
                        res = dp[i - 1] > dp[j] + 1 ? dp[i - 1] : dp[j] + 1;
                        temp[i]=dp[i - 1] > dp[j] + 1 ?temp[i-1]:nums[i];
                    }
                }
                dp[i] = res;
            }
        }
            return dp[len - 1];
    }
    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; i++) {
            int curVal = nums[i];
            for (int j = 0; j < i; j++) {
                if (curVal > nums[j]) { dp[i] = Integer.max(dp[j] + 1, dp[i]); }
            }
        }
        int res = dp[0];
        for (int i = 0; i < len; i++) {
            res = Integer.max(res, dp[i]);
        }
        return res;
    }
    public static void main(String args[]){
        int[] s={3,5,6,2,5,4,19,5,6,7,12};
        System.out.println(lengthOfLIS(s));
    }
}
