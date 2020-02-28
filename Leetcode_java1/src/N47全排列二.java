import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N47全排列二 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        boolean[] judge = new boolean[len];
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        tool(nums, judge, 0, temp);
        return res;
    }
    public static void tool(int[] nums, boolean[] judge, int index, List<Integer> temp){
        if(index==nums.length) return;
        int len = nums.length;

        for(int i=0;i<len;i++ ){
            if(i>0)if(judge[i]==false&&judge[i-1]==false&&nums[i]==nums[i-1])continue;
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
    // 在上面的基础上面修改的
    public List<List<Integer>> permuteUnique1(int[] nums) {
        int len = nums.length;
        boolean[] judge = new boolean[len];
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        tool(nums, judge, 0, temp, res);
        return res;
    }
    public  void tool(int[] nums, boolean[] judge, int index, List<Integer> temp, List<List<Integer>> res){
        if(index==nums.length) return;
        int len = nums.length;
        for(int i=0;i<len;i++ ){
            if(i>0)if(judge[i]==false&&judge[i-1]==false&&nums[i]==nums[i-1])continue;
            if(judge[i]==false){
                temp.add(nums[i]);
                judge[i] = true;
                if(index==nums.length-1) {
                    res.add(new ArrayList<>(temp));
                }
                tool(nums, judge, index+1, temp, res);
                judge[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args){
        int[] s = {1,1,2};
        List<List<Integer>> res = permuteUnique(s);
    }
}
