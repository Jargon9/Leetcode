import java.util.HashMap;

public class N3无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max=1, tempmax=1;
        int sta=0, end=1;
        if(s.length()>0) map.put(s.charAt(0), 1);
        while (end<s.length()){
            char temp = s.charAt(end);
            if(!map.containsKey(temp)){
                map.put(temp, 1);
                tempmax++;
                if(tempmax>max) max = tempmax;
                end++;
            }
            else{
                map.remove(temp);
                do{
                    sta++;
                    if(map.containsKey(s.charAt(sta)))
                        map.remove(s.charAt(sta));
                    tempmax--;
                }while (s.charAt(sta)!=temp);
                sta++;
                map.put(s.charAt(end), 1);
                end++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String s= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
