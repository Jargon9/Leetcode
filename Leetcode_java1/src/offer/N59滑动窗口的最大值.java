package offer;

public class N59滑动窗口的最大值 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] max = new int[nums.length-k+1];
        if(nums.length==0) {
            int[] res = {};
            return res;
        }
        int maxNumIndex = findmax(nums, 0, k);
        max[0]  = nums[maxNumIndex];
        for(int i=k;i<nums.length;i++){
            int Maxindex = i-k+1;
            if(maxNumIndex!=Maxindex-1){
                if(nums[i]>=max[Maxindex-1]){
                    maxNumIndex = i;
                    max[Maxindex] = nums[i];
                }else max[Maxindex] = nums[maxNumIndex];
            }else{
                maxNumIndex = findmax(nums, i-k+1, k);
                max[Maxindex] = nums[maxNumIndex];
            }
        }
        return max;
    }
    public static int findmax(int[]nums, int l, int k){
        int r = l+k, tempres = l;
        while(l<r){
            if(nums[l]>nums[tempres]){
                tempres = l;
            }
            l++;
        }
        return tempres;
    }
    public static void main(String[] args){
        int[] s = {1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(s, 3);
    }
}
