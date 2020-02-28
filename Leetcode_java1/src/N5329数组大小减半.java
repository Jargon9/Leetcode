import javafx.util.Pair;

import java.util.*;

public class N5329数组大小减半 {
    public static int minSetSize(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int temp:arr){
            if(map.containsKey(temp)){
                map.replace(temp, map.get(temp), map.get(temp)+1);
            }else{
                map.put(temp, 1);
            }
        }
        Pair<Integer,Integer>[] Store = new Pair[map.size()];
        int index=0;
        for(int temp:map.keySet()){
            Store[index] = new Pair<>(temp, map.get(temp));
            index++;
        }
        Arrays.sort(Store, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return -o1.getValue()+o2.getValue();
            }
        });
        int num=0, sum=0;
        for(int i=0;i<map.size();i++){
            sum = sum +Store[i].getValue();
            num++;
            if(sum>=len/2){
                return num;
            }
        }
        return num;
    }
    public static void main(String[] args){
        int[] s= {};
        System.out.println(minSetSize(s));
    }
}
