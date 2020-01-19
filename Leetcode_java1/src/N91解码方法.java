
public class N91解码方法 {
    public static int numDecodings(String s) {
        int len = s.length();
        if(len==0) return 0;
        int[] res = new int[len+1];
        if(s.charAt(0)-48>0)res[1] = 1;
        if(len>=2) {
            if (Integer.parseInt(s.substring(0, 2)) <= 26&&Integer.parseInt(s.substring(0, 2)) > 0) {
                res[2] = (s.charAt(1)-48==0)? res[1]:res[1]+1;
            } else res[2] = res[1];
            if(res[1]==0) return 0;
            for (int i = 2; i < len; i++) {
                int temp = Integer.parseInt(s.substring(i - 1, i + 1));
                if (temp <= 26&&temp>0) {
                    res[i + 1] = (s.charAt(i)-48==0)?res[i]:res[i] + res[i - 1];
                }
                else {
                    res[i + 1] = res[i];
                }
            }
        }
        return res[len];
    }
    public static void main(String[] args){
        String s = "01";
        System.out.println(numDecodings(s));
    }
}
