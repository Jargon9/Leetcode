import java.util.Scanner;

import com.sun.accessibility.internal.resources.accessibility;
import com.sun.org.apache.bcel.internal.generic.NEW;


public class No7斐波那契数列 {
	static int a[] = new int[39];

    public static int Fibonacci(int n) {
    	if(n==0){
    		return 0;
    	}
        if(n == 1||n == 2){
        	a[n-1]=1;
        	return 1;
        }
        else{
        	a[0]=a[1]=1;
        	for(int i=2;i<n;i++){
        		a[i]=a[i-1]+a[i-2];
        	}
        	return a[n-1];
        }
    }
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int Na =in.nextInt();
			System.out.println(Fibonacci(Na));
	    }
		
	

}
