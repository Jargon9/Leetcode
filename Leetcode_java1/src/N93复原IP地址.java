import java.util.ArrayList;
import java.util.List;

public class N93复原IP地址 {
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();

        return res;
    }
    public static void tool(List<String> res, String s, int num, ArrayList<String> tempres){
        if(num == 1&&(s.charAt(0)!=0&&Integer.parseInt(s)<255)||(s.charAt(0)=='0'&&s.length()==1)&&s.length()>0){
            for(String Exm: tempres) {
                String temp = "";
                temp = Exm + s;
                res.add(temp);
            }
            return;
        }
        else if(num == 2){
            for(int i=1; i<=3 ;i++){
                String tempS = s.substring(0, i);
                if(tempS.charAt(0)!=0&&Integer.parseInt(tempS)<255||tempS.charAt(0)==0&&tempS.length()==1){
                    String newS = s.substring(i);
                    for(int j=0;j<tempres.size();j++){

                    }
                }
            }
        }
    }
    public static void main(String[] args){
        String s="001";
        System.out.println(s.indexOf(s));
    }
}
