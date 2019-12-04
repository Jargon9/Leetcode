import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N39组合总和 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> candi = new ArrayList<>();
        List<Integer> candidates1 = new ArrayList<>();
        for(int i : candidates){
            candidates1.add(i);
        }
        FindCandidate(candidates1, target, list, candi );
        return list;
    }
    public static void FindCandidate(List<Integer>candidates, int target, List<List<Integer>> list, List<Integer> candi){
        List<Integer> NewCandi = new ArrayList<>(candi);
        List<Integer> NewCandidates = new ArrayList<>(candidates);
        if(target==0) {
            list.add(NewCandi);
            candi.remove(candi.size()-1);
            return;
        }
        else if(target<0) {
            candi.remove(candi.size()-1);
            return;
        }
        else{
            while(!NewCandidates.isEmpty()){
                int temp =NewCandidates.get(NewCandidates.size()-1);
                NewCandi.add(temp);
                FindCandidate(NewCandidates, target-temp, list, NewCandi);
                NewCandidates.remove(NewCandidates.size()-1);
            }
            if(candi.size()!=0)
                candi.remove(candi.size()-1);
        }
    }

    public static void main(String[] arg){
        int[] candi = {1,2};
        List<List<Integer>> list = new ArrayList<>();
        list = combinationSum(candi, 4);
    }

}
