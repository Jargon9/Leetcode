import java.util.ArrayList;
import java.util.List;

public class N264丑数二 {
    public static int nthUglyNumber(int n) { //最小堆的想法
        int sum=0, res = 1;
        List<Integer> store = new ArrayList<>();
        int mark1 = 1, mark2 = 1, mark3= 1;
        if(n>0){
            int mark=1;
            store.add(mark);
            while(store.size()<n){
                int temp1 = store.get(mark1-1)*2, temp2 = store.get(mark2-1)*3, temp3= store.get(mark3-1)*5;
                int min = Math.min(Math.min(temp1, temp2), temp3);
                mark1 = temp1==min?mark1+1:mark1;
                mark2 = temp2==min?mark2+1:mark2;
                mark3 = temp3==min?mark3+1:mark3;
                store.add(min);
            }
        }
        res = store.get(n-1);
        return res;
    }

    public static void main(String[] args){
        System.out.println(nthUglyNumber(20));
        String s = "";
        s.split(" ");

    }
}
