
public class NO6旋转数组的最小 {

    public static int minNumberInRotateArray(int [] array) {
    	if(array.length == 0){
    		return 0;
    	}
    	else{
    		for(int i=0;i<array.length-1;i++){
    			if(array[i]>array[i+1])
    				return array[i+1];
    		}
    	return array[0];
    	}
    }

	public static void main(String[] args) {
		int []a= {2,3,4,1,2};
		System.out.println(minNumberInRotateArray(a));
		

	}

}
