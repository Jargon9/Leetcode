import java.util.ArrayList;

public class N57和为s的连续正数序列 {
    public int[][] findContinuousSequence(int sum) {
        int index1=1;
        int index2=1;
        int num=index2-index1+1;
        int Plus=0;
        int[][] res1 = new int[0][];
        ArrayList<ArrayList<Integer>> a2=new ArrayList<>();
        if(sum<1){return res1;}
        while(num>0){
            num=index2-index1+1;
            Plus=(index1+index2)*num/2;
            if(Plus<sum){index2++;}
            else if(Plus>sum){index1++;}
            else {
                if(num==1){break;}
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=index1;i<=index2;i++){
                    a.add(i);
                }
                a2.add(a);
                index2++;
            }
        }
        int[][] res = new int[a2.size()][];
        for(int i=0;i<a2.size();i++){
            int[] temp = new int[a2.get(i).size()];
            for(int j=0;j<a2.get(i).size();j++){
                temp[j] =  a2.get(i).get(j);
            }
            res[i] = temp;
        }
        String ss= "";
        ss = ss.trim();
        return res;

    }
}
