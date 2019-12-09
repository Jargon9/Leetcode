public class N198打家劫舍 {
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len>1)
        {
            int[] num = new int[len];
            num[0] = nums[0];
            num[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < len; i++) {
                num[i] = Math.max(num[i-1], num[i-2]+nums[i]);
            }
            return num[len-1];
        }
        else{
            if(len == 1)
                return nums[0];
        }
        return 0;
    }
    public static void main(String[] args){
        int[] x = {2,1,1,2};
        System.out.println(rob(x));
    }
}
