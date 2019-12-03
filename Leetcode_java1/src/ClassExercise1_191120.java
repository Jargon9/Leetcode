import java.util.Stack;

public class ClassExercise1_191120 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int poplen=popped.length, pushlen=pushed.length, temp=0;;
        if(poplen!=pushlen) return false;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<poplen;i++){
            while(temp<pushlen) {
                if(s.isEmpty()||s.peek()!=popped[i]) {
                    s.push(pushed[temp]);
                    if(temp+1<=pushlen)
                        temp=temp+1;
                }
                else if (s.peek()==popped[i]) {
                    s.pop();
                    break;
                }
            }
            if(!s.isEmpty()&&s.peek()==popped[i]){
                s.pop();
            }
        }
        if(s.isEmpty())return true;
        else return false;
    }
    public static void main(String[] args){
        int[] push={1,0};
        int[] pop={1,0};
        System.out.println(validateStackSequences(push, pop));
    }

}
