import java.util.Arrays;

public class N217存在重复元素 {
    public boolean containDuplicate(int [] nums){
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
