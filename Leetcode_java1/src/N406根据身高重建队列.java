import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class N406根据身高重建队列 {
    public static int[][] reconstructQueue(int[][] people) {
        int len=people.length;
        if(len>0){
            Arrays.sort(people, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0]==o2[0])return o1[1] - o2[1];
                    return o2[0]-o1[0];
                }
            });
        }
        ArrayList<int[]> res = new ArrayList<>();
        for(int[] temp:people){
            res.add(temp[1], temp);
        }
        for(int i=0;i<len;i++){
            people[i]=res.get(i);
        }
        return people;
    }
    public static void main(String[] args){
//        int[][] test = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] test = {};
        System.out.println(reconstructQueue(test));
    }
}
