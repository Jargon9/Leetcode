package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class N2替换空格 {
    public static String replaceSpace(StringBuffer str) {
        String res=str.toString();
        int len =str.length();
        for(int i=0;i<len;i++){
            if(res.charAt(i)==' '){
                res = res.substring(0, i) +"%20" + res.substring(i+1,res.length());
                len = len +2;
            }
        }
        return res;
    }
    public static void main(String[] args){
        StringBuffer s = new StringBuffer(" aaasda ");
        System.out.println(replaceSpace(s));
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> nx = new LinkedList<>();
        nx.offer(1);
        nx.poll();
        nx.size();
    }
}
