import com.sun.org.apache.bcel.internal.generic.NEW;
import java.lang.Math;

public class NO7跳台阶 {
	static int []a = new int[500];
    public static int JumpFloor(int n) {
        	a[0]=1;
        	a[1]=2;
        	for(int i=2;i<n;i++){
        		a[i]=a[i-1]+a[i-2];
        	}
        	return a[n-1];
        }
    public static int Jump(int n) {
    	int i=1;
    	return i<<(n-1);
    }

	public static void main(String[] args) {
		System.out.println(Jump(5));

	}

}
