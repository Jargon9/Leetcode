public class N220存在重复元素Ⅲ {
    public static int judge(int num){
        if(num>0) return 1;
        else if(num<0) return -1;
        else return 0;
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        int len = nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len&&j<i+k+1;j++){
                if((Math.abs((long)nums[i]-(long)nums[j]))<=t){
                    if(nums[j]!=0) {
                         if (judge(nums[i])*judge(nums[j])>=0 || (nums[i] * nums[j] < 0 && 2147483647 - Math.abs(nums[i]) > nums[j]))
                            return true;
                    }
                    else return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums= {2147483647,-2147483647};
        System.out.println(containsNearbyAlmostDuplicate(nums, 1 , 2147483647));
        System.out.println((long)(2147483647)+(long)2147483647);
    }
}
