import java.util.ArrayList;


public class No13调整数组顺序使奇数位于偶数前面 {
    public static void reOrderArray(int [] array) {
        int mark1,mark2;
        mark1=mark2=0;
        while(mark1<array.length&&mark2<array.length){
        	if(array[mark1]%2==1){
        		mark1++;
        	}
        	else {
        		mark2=mark1;
                while(mark1<array.length&&mark2<array.length){
                	if(array[mark1]%2==0){
                		mark1++;
                	}
                	else{
                		for(int i=mark1;i>mark2;i--){
                			int temp=array[i-1];
                			array[i-1]=array[i];
                			array[i]=temp;
                		}
                		mark2++;
                		mark1++;
                	}
                }
        	}
        }
    }
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7};
		reOrderArray(array);
		for(int a:array)
			System.out.print(a);
	}

}
