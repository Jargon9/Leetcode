import java.util.ArrayList;
import java.util.List;

public class N43字符串相乘 {
    public static String multiply(String num1, String num2) {
        int index1=0, index2=0;
        List<Integer> res = new ArrayList<>();
        int len1 = num1.length(), len2 = num2.length();
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int mult1 = (int)(num1.charAt(i)-'0')*(int)(num2.charAt(j)-'0');
                if(res.size()-1<index1+len2-1-j){
                    res.add(index1+len2-1-j, mult1);
                }else{
                    res.set(index1+len2-1-j, res.get(index1+len2-1-j)+mult1);
                }
            }
            index1++;
        }
        String num3 = "";
        int add = 0;
        for(int i=0;i<res.size();i++){
            int temp = res.get(i);
            temp = temp + add;
            add = temp /10;
            temp = temp%10;
            num3 = (char)(temp+(int)'0')+num3;
        }
        if(add!=0) num3 = (char)(add+(int)'0')+num3;
        if(num3.charAt(0)=='0') return "0";
        return num3;
    }
    public static void main(String[] args){
        List<Integer> res = new ArrayList<>();
        String num1 = "";
        String num2 = "";
        System.out.println(multiply(num1, num2));
    }
}
