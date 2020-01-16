import java.util.Arrays;
import java.util.Comparator;

public class N435无重叠区间 {


    public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length!=0){
            int Hlen = intervals.length, time = 0,sta=0;
            Arrays.sort(intervals, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1]==o2[1]) return o1[0]-o2[0];
                    return o1[1] - o2[1];
                }
            });
            int i=1;
            while(i<Hlen){
                if(intervals[sta][1]>intervals[i][0]){
                    time++;
                    intervals[i][1] = intervals[sta][1];
                    intervals[i][0] = intervals[sta][0];
                }
                sta++;
                i++;
            }
            return time;
        }
        return 0;
    }
    public static void main(String[] args){
        int[][] test = {{0,2},{1,3},{2,4},{3,5},{4,6}};
        System.out.println(eraseOverlapIntervals(test));
    }
}
