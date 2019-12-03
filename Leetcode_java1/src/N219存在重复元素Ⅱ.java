import java.util.HashMap;

public class N219存在重复元素Ⅱ {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k)
                    return true;
                else map.replace(nums[i], map.get(nums[i]), i);
            }
            else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums= {1, 2, 1, 1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
