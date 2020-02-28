import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N349两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> mark = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int temp:nums1){
            if(!mark.containsKey(nums1)){
                mark.put(temp, true);
            }
        }
        for(int temp:nums2){
            if(mark.containsKey(temp)){
                res.add(temp);
                mark.remove(temp);
            }
        }
        int[] NewRes = new int[res.size()];
        for(int i=0;i<res.size();i++){
            NewRes[i] = res.get(i);
        }
        return NewRes;
    }
}
