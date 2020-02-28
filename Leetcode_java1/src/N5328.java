import java.util.ArrayList;

public class N5328 {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res1 = new int[k];
        int len = mat.length, wid = 0;
        if (len > 0) wid = mat[0].length;
        ArrayList<Integer>[] res = new ArrayList[wid+1];
        for(int i=0;i<wid+1;i++){
            ArrayList<Integer> exp = new ArrayList<>();
            res[i] = exp;
        }
        for (int i = 0; i < len; i++) {
            int num = 0;
            for (int j = 0; j < wid; j++) {
                if (mat[i][j] == 1) {
                    num++;
                    if(j==wid-1){
                        res[num].add(i);
                    }
                }
                else {
                    res[num].add(i);
                    break;
                }
            }
        }
        int index = 0;
        for (int i = 0; i < wid+1; i++) {
            for (int temp : res[i])
                if (index < k) {
                    res1[index] = temp;
                    index++;
                } else return res1;
        }
        return res1;
    }

    public static void main(String[] args) {
        int[][] s = {{1,1,0,0,0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int[] res= kWeakestRows(s, 3);
        System.out.println(kWeakestRows(s, 4));
    }
}
