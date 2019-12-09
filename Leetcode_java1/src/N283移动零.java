public class N283移动零 {
    public static void moveZeroes(int[] nums) {
        int ZoreC=0;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] == 0){
                ZoreC++;
            }
            else {
                nums[i-ZoreC] = nums[i];
            }
        }
        for(int j=0;j<ZoreC;j++){
            nums[len-j-1] = 0;
        }
    }
    public static void main(String[] args){
        int[] s = {0,1,0,3,12};
        moveZeroes(s);
    }
}
