import java.util.*;

public class N452用最少数量的箭引爆气球 {
    public static int findMinArrowShots(int[][] points) {
        int high=points.length;
        if(high!=0) {
            int wide=points[0].length;
        }else return 0;
        if(high==1) return 1;
        HashMap<Integer, Integer> InterMap = new HashMap<>();
        for(int i=0;i<high;i++){
            if(!InterMap.containsKey(points[i][0])) InterMap.put(points[i][0],points[i][1]);
            else{
                InterMap.replace(points[i][0],InterMap.get(points[i][0]),
                        InterMap.get(points[i][0])>points[i][1]?points[i][0]:InterMap.get(points[i][0]));
            }
        }
        Set<Integer> StaSet = InterMap.keySet();
        List<Integer> list = new ArrayList<>(StaSet);
        Collections.sort(list);
        int sta=-2147483647,end=-2147483647,tempend=0,count=0;
        for(int tempsta:list){
            tempend = InterMap.get(tempsta);
            if(tempsta>end){
                count++;
                sta = tempsta;
                end = tempend;
            }else {
                end = end > tempend?tempend:end;
                sta = sta > tempsta?sta:tempsta;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[][] points = {{-1,1},{0,1},{2,3},{1,2}};
        System.out.println(findMinArrowShots(points));
    }
}
