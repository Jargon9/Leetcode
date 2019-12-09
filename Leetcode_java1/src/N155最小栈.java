import java.util.Stack;

public class N155最小栈 {
    class MinStack {
        /**
         * initialize your data structure here.
         */
        public
            Stack<Integer> stack;
            Stack<Integer> NewMinStack;
        public  MinStack() {
            stack = new Stack<>();
            NewMinStack = new Stack<>();
        }

        public void push(int x) {
            if(stack.isEmpty()){
                stack.push(x);
                NewMinStack.push(x);
            }
            else {
                stack.push(x);
                int temp = NewMinStack.peek();
                if(x<temp){
                    NewMinStack.push(x);
                }else{
                    NewMinStack.push(temp);
                }
            }
        }

        public void pop() {
            stack.pop();
            NewMinStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return NewMinStack.peek();
        }
    }
}
