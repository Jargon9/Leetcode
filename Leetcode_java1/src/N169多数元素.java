import java.util.HashMap;

public class N169多数元素 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mark = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<len ; i++){
            if(mark.containsKey(nums[i])){
                mark.replace(nums[i], mark.get(nums[i]), mark.get(nums[i])+1);
            }
            else{
                mark.put(nums[i], 1);
            }
            if(mark.get(nums[i]) > len/2)return nums[i];
        }
        return -1;
    }
    public static void main(String[] args){

    }
}
