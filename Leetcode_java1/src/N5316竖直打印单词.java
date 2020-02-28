import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> printVertically(String s) {
        String[] temp = s.split(" ");
        int len = temp.length, max = 0,flag=0;
        for(int i=len-1;i>=0;i--){
            if(temp[i].length()>max) {
                max = temp[i].length();
            }
        }
        int[] index = new int[max];
        for(int i=len-1;i>=0;i--){
            for(;flag<temp[i].length();flag++)
                index[flag] = i;
        }
        List<String> res = new ArrayList<>();
        for(int i=max;i>0;i--){
            String Ts = new String();
            res.add(Ts);
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<max;j++){
                if(j<temp[i].length()){
                    String repalce = res.get(j) + temp[i].substring(j, j+1);
                    res.set(j, repalce);
                }else{
                    if(i<index[j]){
                        String repalce = res.get(j) +" ";
                        res.set(j, repalce);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        String s = "CONTEST IS COMING";
        printVertically(s);
    }

}