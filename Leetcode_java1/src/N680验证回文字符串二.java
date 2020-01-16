public class N680验证回文字符串二 {
    public static boolean validPalindrome(String s) {
        int sta=0, end=s.length()-1;
        int mark=1,tempsta=0,tempend=s.length()-1;
        while(sta<end){
            if(s.charAt(sta)!=s.charAt(end)){
                if(mark == 1){
                    tempsta = sta+1;
                    tempend = end;
                    end--;
                    mark=2;
                    continue;
                }else if(mark == 2){
                    sta = tempsta;
                    end = tempend;
                    mark = -1;
                    continue;
                }
                return false;
            }
            else {
                sta++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(validPalindrome("deeee"));
    }
}
