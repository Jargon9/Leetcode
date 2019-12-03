import java.util.Stack;

public class NO20包含min的栈 {
    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        if(temp != null){
            if(node <= temp ){
                temp = node;
                min.push(node);
            }
            else{min.push(temp);}
            data.push(node);
        }else{
            temp = node;
            data.push(node);
            min.push(node);
        }
    }
     
    public void pop() {
        int num = data.pop();
        int num2 = min.pop();

    }
     
    public int top() {
        return data.peek();
    }
     
    public int min() {
        return min.peek();
    }
/*	Integer tempMin=null;
	Stack<Integer> min= new Stack<>();
	Stack<Integer> data= new Stack<>();
    public void push(int node) {
        data.push(node);
        if(min.empty()==true){
        	min.push(node);
        	tempMin = node;
        }
        else{
        	if(node<tempMin){
        		min.push(node);
        		tempMin=node;
        	}
        	else{
        		min.push(tempMin);
        	}
        }
    }
    
    public void pop() {
        data.pop();
        min.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return min.peek();
    }*/

	public static void main(String[] args) {
		
		
	}

}
