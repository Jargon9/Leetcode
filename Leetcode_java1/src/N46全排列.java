import java.util.ArrayList;
import java.util.List;

public class N46全排列 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
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
                exp.add(nums[i]);
                judge[i] = true;
                if(index==nums.length-1) {
                    res.add(exp);
                }
                tool(nums, judge, index+1, exp);
                judge[i] = false;
            }
        }
    }
    public static void main(String[] args){
        int[] s = {1,2,3};
        List<List<Integer>> res = permute(s);
        ArrayList<Integer>[] res1 = new ArrayList[1];
        int[][] res11={{}};

    }
}
