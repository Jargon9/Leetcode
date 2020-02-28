import java.util.HashMap;

public class N205同构字符串 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> ChToCh = new HashMap<>();
        int len = s.length();
        if(len>0){
            for(int i=0;i<len;i++){
                if(ChToCh.containsKey(s.charAt(i))){
                    if(ChToCh.get(s.charAt(i))!=t.charAt(i)) return false;
                }else{
                    ChToCh.put(s.charAt(i), t.charAt(i));
                }
            }
            ChToCh.clear();
            for(int i=0;i<len;i++){
                if(ChToCh.containsKey(t.charAt(i))){
                    if(ChToCh.get(t.charAt(i))!=s.charAt(i)) return false;
                }else{
                    ChToCh.put(t.charAt(i), s.charAt(i));
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "ab";
        String t = "aa";
        System.out.println(isIsomorphic(s, t));
    }
}
