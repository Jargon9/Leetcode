import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N40组合总和二 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        if(len>0){
            Arrays.sort(candidates);
            List<Integer> exp = new ArrayList<>();
            int mark=0;
            tool(candidates, target, mark, exp);
        }
        return res;
    }
    public static void tool(int[] candidates, int target, int mark, List<Integer> exp){
        if(target==0){
            List<Integer> expTemp = new ArrayList<>(exp);
            for(List<Integer> temp:res){
                if(temp.equals(expTemp)) return;
            }
            res.add(expTemp);
            return;
        }else if(target<0) return;
        for(int i=mark;i<candidates.length;i++){
            exp.add(candidates[i]);
            tool(candidates, target-candidates[i], i+1 , exp);
            exp.remove(exp.size()-1);
        }
    }
    ///改进
    public  List<List<Integer>> combinationSum22(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len>0){
            Arrays.sort(candidates);
            List<Integer> exp = new ArrayList<>();
            int mark=0;
            tool2(candidates, target, mark, exp, res);
        }
        return res;
    }
    public  void tool2(int[] candidates, int target, int mark, List<Integer> exp, List<List<Integer>> res){
        if(target==0){
            List<Integer> expTemp = new ArrayList<>(exp);
            res.add(expTemp);
            return;
        }
        for(int i=mark;i<candidates.length;i++){
            if(candidates[i]>target) break;
            if(i>mark&&candidates[i]==candidates[i-1])continue;
            exp.add(candidates[i]);
            tool2(candidates, target-candidates[i], i+1 , exp, res);
            exp.remove(exp.size()-1);
        }
    }
    public static void main(String[] args){
        int[] can = {2,5,2,1,2};
        List<List<Integer>> s = combinationSum2(can, 5);
    }
}
