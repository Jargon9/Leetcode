import java.util.ArrayList;
import java.util.List;

public class N77组合 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        int[] can = new int[n];
        for(int i=0;i<n;i++){
            can[i] = i+1;
        }
        boolean[] judge = new boolean[n];
        List<Integer> temp = new ArrayList<>();
        tool(can, judge, 0, temp, k, 0);
        return res;
    }
    public static void tool(int[] nums, boolean[] judge, int index, List<Integer> temp, int k, int mark){
        if(index==nums.length) return;
        int len = nums.length;
        for(int i=mark;i<len;i++ ){
            if(judge[i]==false){
                temp.add(nums[i]);
                judge[i] = true;
                if(index==k-1) {
                    res.add(new ArrayList<>(temp));
                }
                tool(nums, judge, index+1, temp, k, mark+1);
                judge[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args){
        int[] s = {1,2,3};
        List<List<Integer>> res = combine(3, 1);
    }
}
