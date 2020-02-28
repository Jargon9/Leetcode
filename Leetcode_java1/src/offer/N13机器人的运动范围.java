package offer;



import javafx.util.Pair;
import java.util.LinkedList;
import java.util.Queue;

public class N13机器人的运动范围 {
    public static int movingCount(int m1, int n1, int k) {
        if(m1<=0||n1<=0) return 0;
        boolean[][] mark = new boolean[m1][n1];
        int res = 0;
        int[][] dir={{1,0},{0,1}};
        Queue<int[]> store = new LinkedList<>();
        Queue<int[]> store1 = new LinkedList<>();
        int[] s = {0,0};
        store.add(s);
        while(store.size()!=0) {
            int[] tempEle = store.poll();
            int m= tempEle[0],n = tempEle[1];
            if(Judge(m ,n , k)) res++;
            for (int[] temp : dir) {
                if(m + temp[0]<mark.length&&n + temp[1]<mark[0].length)
                    if (mark[m + temp[0]][n + temp[1]] == false) {
                        mark[m + temp[0]][n + temp[1]] = true;
                        int[] s1 = {m + temp[0], n + temp[1]};
                        store1.add(s1);
                        store.add(s1);
                    }
            }
        }
        return res;
    }
    public static boolean Judge(int n,int m, int k){
        int sum=0;
        while(n!=0){
            int temp = n%10;
            sum = sum + temp;
            n = n/10;
        }
        while(m!=0){
            int temp = m%10;
            sum = sum + temp;
            m = m/10;
        }
        if(sum <=k) return true;
        else return false;
    }
    public  static void main(String[] args){
        System.out.println(movingCount(4, 4, 3));
    }
}
