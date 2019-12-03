import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
import java.util.Comparator;

import java.util.Vector;

public class NO32把数组排成最小的数 {

/*    public static String PrintMinNumber(int [] numbers) {
    	String MinNumber =new String();
    	String[] s2=new String[numbers.length];
    	int maxNum=0;
    	for(int i=0;i<numbers.length;i++){
        	String s =String.valueOf(numbers[i]);
        	s2[i]=s;
    	}
    	Stack<String> stack=new Stack<>();
    	for(int j=0;j<numbers.length;j++){
	    	for(int i=0;i<numbers.length;i++){
	    		int temp=(int)s2[i].charAt(0);
	    		if(temp>(int)s2[maxNum].charAt(0)){
	    			maxNum=i;
	    		}
	    		if(temp==(int)s2[maxNum].charAt(0)){
	    			int k=1;
	    			while(k<s2[maxNum].length()){
	    				
	    			}
	    		}
	    	stack.push(s2[maxNum]);
	    	}
    	}
    	
    	return MinNumber;
    }*/
	public static String PrintMinNumber(int[] numbers) {
		String answer="";
		int n;
		ArrayList<Integer> list=new ArrayList<>();
		n=numbers.length;
		for(int i=0;i<n;i++){
			list.add(numbers[i]);
		}
		Collections.sort(list,);
	}
	public static void main(String[] args) {
		int i=456,j=789;
    	String s =String.valueOf(i);
    	String s2=String.valueOf(j);
    	System.out.println(s.charAt(0));
	}

}
