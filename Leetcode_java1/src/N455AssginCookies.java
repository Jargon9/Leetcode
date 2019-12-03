import java.util.Arrays;

public class N455AssginCookies {
    public static int findContentChildren(int[] g, int[] s) {
        int Child=0, Cookie=0, Clen=g.length,Slen=s.length;
        int num=0;
        if(Clen>0&&Slen>0) {
//            -------------------------------
            Arrays.sort(g);
            Arrays.sort(s);
//--------------------------------------------

            while (Child < Clen && Cookie < Slen) {
                if (g[Child] > s[Cookie]) {
                    Cookie++;
                } else {
                    Cookie++;
                    num++;
                    Child++;
                }
            }
        }
        return num;
    }
    public static void main(String[] args){
        int[] g={1,1,2,3};
        int[] s={1,1};
        System.out.println(findContentChildren(g,s));
    }

}
