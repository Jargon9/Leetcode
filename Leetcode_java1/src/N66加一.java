import java.util.ArrayList;

public class N66加一 {
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        if(digits[digits.length-1]>=10) {
            ArrayList<Integer> NewDi = new ArrayList<>();
            int mark=0;
            for (int i = digits.length - 1; i >= 0; i--) {
                int temp=0;
                if(mark==1){
                    digits[i]++;
                    mark=0;
                }
                if(digits[i]>=10){
                    mark=1;
                    digits[i]=digits[i]%10;
                }
                temp=digits[i]+temp;
                NewDi.add(0, temp);
            }
            if(mark==1){
                NewDi.add(0,1);
            }
            int len = NewDi.size();
            int[] res = new int[len];
            for(int j=0;j<len;j++){
                res[j] = NewDi.get(j);
            }
            return res;
        }
        return digits;
    }
    public static void main(String[] args){
        int[] s ={9,9};
        int[] s1=plusOne(s);
        System.out.println(plusOne(s));
    }
}
