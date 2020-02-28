import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N56合并区间 {
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a1, a2) ->{
            if(a1[1]>a2[1]) return 1;
            else if(a1[1]<a2[1]) return -1;
            else{
                if(a1[0]>a2[0]) return 1;
                else if(a1[0]<a2[0]) return -1;
                else return 0;
            }
        });
        List<int[]> resTemp = new ArrayList<>();
        int sta = Integer.MIN_VALUE, end = Integer.MIN_VALUE, mark=1;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>end&&mark==0) {
                int[] s = new int[2];
                s[0] = sta;
                s[1] = end;
                sta = intervals[i][0];
                end = intervals[i][1];
                resTemp.add(s);
            }else{
                sta = mark==1?intervals[i][0]:Math.min(sta, intervals[i][0]);
                end = mark==1?intervals[i][1]:Math.max(end, intervals[i][1]);
            }
            if(i==intervals.length-1){
                int[] s = new int[2];
                s[0] = sta;
                s[1] = end;
                resTemp.add(s);
            }
            mark=0;
        }
        int[][] res = new int[resTemp.size()][2];
        for(int i=0;i<resTemp.size();i++){
            res[i] = resTemp.get(i);
        }

        return res;
    }
    public static void main(String[] args){
        int[][] s = {{1,4}};
        s = merge(s);
    }
}
