import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class N241为运算表达式设置优先级 {
    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        int mark=0, Fir=0;
        for(int i=0;i<input.length();i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' ||
                    input.charAt(i) == '*'){ mark=1; }
            Fir = Fir*10 + ((int)input.charAt(i)-48);
        }
        if(mark==0){ res.add(Fir); }
        else{
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='+'||input.charAt(i)=='-'||
                        input.charAt(i)=='*'){
                    List<Integer> right = new ArrayList<>();
                    List<Integer> left = new ArrayList<>();
                    String Sleft = input.substring(0, i);
                    String Sright= input.substring(i+1, input.length());
                    right = diffWaysToCompute(Sright);
                    left = diffWaysToCompute(Sleft);
                    for( int tempr :right){
                        for(int templ :left){
                            if(input.charAt(i)=='+'){
                                res.add(tempr+templ);
                            } else if (input.charAt(i) == '*') {
                                res.add(tempr*templ);
                            } else {
                                res.add(templ-tempr);
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args){
        String x = "10+5";
        System.out.println(diffWaysToCompute(x));
    }
}
