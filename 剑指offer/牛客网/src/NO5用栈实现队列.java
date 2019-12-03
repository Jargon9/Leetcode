import java.util.Stack;

import com.sun.org.apache.bcel.internal.generic.POP;


public class NO5用栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.empty()==true){
	    	while(stack1.empty()!=true){
	    			int temp=stack1.pop();
	    			stack2.push(temp);
				}
    	}
    	return stack2.pop();
    	}
    }
	public static void main(String[] args) {
		
(	    push(4);
	    
	    
	}

}
