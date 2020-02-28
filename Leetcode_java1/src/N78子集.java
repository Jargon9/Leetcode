import java.util.ArrayList;
import java.util.List;

public class N78子集 {
    public static List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> exp = new ArrayList<>();
        res.add(exp);
        int len = nums.length;
        boolean[] judge = new boolean[len];
        List<Integer> temp = new ArrayList<>();
        tool(nums, judge, 0, temp);
        return res;
    }
    public static void tool(int[] nums, boolean[] judge, int index, List<Integer> temp){
        if(index==nums.length) return;
        int len = nums.length;
        for(int i=0;i<len;i++ ){
            if(judge[i]==false){
                List<Integer> exp = new ArrayList<>();
                for(int j:temp) exp.add(j);
                if(exp.size()==0||exp.get(exp.size()-1)<nums[i]) {
                    exp.add(nums[i]);
                    judge[i] = true;
                    res.add(exp);
                    tool(nums, judge, index + 1, exp);
                    judge[i] = false;
                }
            }
        }
    }
}
