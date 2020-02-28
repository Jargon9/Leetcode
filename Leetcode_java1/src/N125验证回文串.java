public class N125验证回文串 {
    public static boolean isPalindrome(String s) {
        int len = s.length();
        if(len==0) return true;
        int f=0, e = len-1;
        s = s.toLowerCase();
        while(f<e){
            if(Judge(s.charAt(f))&&Judge(s.charAt(e))){
                if(s.charAt(f)!=s.charAt(e)) return false;
                f++;
                e--;
                continue;
            }
            f = Judge(s.charAt(f))? f:f+1;
            e = Judge(s.charAt(e))? e:e-1;
        }
        return true;
    }
    public static boolean Judge(char i){
        if((int)(i-'a')>=0&&(int)(i-'a')<=25){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
