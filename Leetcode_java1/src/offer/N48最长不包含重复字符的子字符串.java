package offer;

import java.util.Arrays;

public class N48最长不包含重复字符的子字符串 {
    public static int lengthOfLongestSubstring(String s) {
        int[] mark = new int[256];
        Arrays.fill(mark, -1);
        int l=0, r=0, len = s.length(),max=0;
        for(int i=0;i<len;i++){
            int index = s.charAt(i);
            if(mark[index]!=-1) {
                if((r-l)>max) max = r-l;
                l = Math.max(l,mark[index]+1);
            }
            mark[index] = i;
            r++;
        }
        max = (r-l)>max?(r-l):max;
        return max;
    }
    public static void main(String[] args){
        String s  = "abba";
        lengthOfLongestSubstring(s);
    }
}
