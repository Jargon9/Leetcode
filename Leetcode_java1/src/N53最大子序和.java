public class N53最大子序和 {
    public static int maxSubArray(int[] nums) {
        int sta=0, end=1, len=nums.length;
        int tempsum=0, Maxtemp=0;
        if(len>0){
            Maxtemp = nums[0];
            while(end<=len){
                tempsum = tempsum + nums[end-1];
                if(tempsum < 0) {
                    if(tempsum>Maxtemp) Maxtemp = tempsum;
                    tempsum = 0;
                    end++;
                    continue;
                }
                else if(tempsum > Maxtemp) Maxtemp = tempsum;
                end++;
            }
        }
        return Maxtemp;
    }
    public static void main(String[] args){
        int[] s = {-2, -1};
        System.out.println(maxSubArray(s));
    }
}
