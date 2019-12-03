

public class NO51构建乘积数组 {

    public static int[] multiply(int[] A) {
        int[] B=new int[A.length];
        int[] C=new int[A.length];
        for(int i=0;i<A.length;i++){
        	B[i]=A[i];
        }
        for(int i=1;i<A.length;i++){
        	A[i]=A[i-1]*A[i];
        	B[A.length-i-1]=B[A.length-i-1]*B[A.length-i];
        }
        for(int i=0;i<A.length;i++){
        	if(i==0){C[i]=B[i+1];}
        	else if(i==A.length-1){
        		C[i]=A[i-1];
        	}
        	else{C[i]=A[i-1]*B[i+1];}
        }
        return C;
    }
	public static void main(String[] args) {
		int[] A={1,5,6,7,8,9};
		multiply(A);

	}

}
