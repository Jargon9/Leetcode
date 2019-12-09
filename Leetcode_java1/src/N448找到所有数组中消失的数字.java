import java.util.ArrayList;
import java.util.List;

public class N448找到所有数组中消失的数字 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int  Order=1;
        List<Integer> res = new ArrayList<>();
        int len = nums.length, temp=1;
        if(len >0) {
            temp = nums[temp-1];
            while (Order<nums.length+1) {
                if((temp)==nums[temp-1]){
                    for(;Order<nums.length+1;Order++){
                        if(Order != nums[Order-1]){
                            temp = nums[Order-1];
                            Order++;
                            break;
                        }
                    }
                }
                int NewTemp = nums[temp-1];
                nums[temp - 1] = temp;
                temp = NewTemp;
            }
        }
        for(int j=1;j<nums.length+1;j++){
            if(j!=nums[j-1]){
                res.add(j);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] s = {4,3,2,7,7,2,3,1};
        List<Integer> res =findDisappearedNumbers(s);
    }
}
