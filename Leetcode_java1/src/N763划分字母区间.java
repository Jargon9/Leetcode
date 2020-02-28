import java.util.*;

public class N763划分字母区间 {
    public static List<Integer> partitionLabels1(String S) {
        HashMap<Character, ArrayList<Integer>> mark = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        List<ArrayList<Integer>> range = new ArrayList<>();
        int len = S.length();
        for(int i=0;i<len;i++){
            if(!mark.containsKey(S.charAt(i))){
                ArrayList<Integer> StaEnd = new ArrayList<>();
                StaEnd.add(i);
                StaEnd.add(i);
                mark.put(S.charAt(i), StaEnd);
            }else{
                List<Integer> temp = mark.get(S.charAt(i));
                if(temp.size()==1){
                    temp.add(i);
                }else {
                    temp.remove(1);
                    temp.add(i);
                }
            }
        }
        for(char s: mark.keySet()){
            range.add(mark.get(s));
        }
        Collections.sort(range, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(o1.get(0)>o2.get(0)) return 1;
                else if(o1.get(0)<o2.get(0)) return -1;
                else {
                    if(o1.get(1)>o2.get(1)) return 1;
                    else if(o1.get(1)<o2.get(1)) return -1;
                    else return 0;
                }
            }
        });
        int sta=range.get(0).get(0), end=range.get(0).get(1);
        for(ArrayList<Integer> s : range){
            if(sta>s.get(0)){
                sta = s.get(0);
            }if(end>s.get(0)){
                end = s.get(1);
            }else{
                res.add(end-sta+1);
                sta = s.get(0);
                end = s.get(1);
            }
        }
        return res;
    }
    public static List<Integer> partitionLabels(String S){
        int[] mark = new int[26];
        for(int i=0;i<S.length();i++){
            mark[(int)S.charAt(i)-'a'] = i;
        }
        int j = 0, sta = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<S.length();i++){
            j = Math.max(j, mark[S.charAt(i)-'a']);
            if(i == j){
                res.add(i - sta + 1);
                sta = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        String S = "ababcbacadefegdehijhklij";
         System.out.println(Math.abs(-1%58));
    }
}
