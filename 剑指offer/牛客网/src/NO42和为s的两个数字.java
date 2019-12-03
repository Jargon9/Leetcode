import java.util.ArrayList;


public class NO42和为s的两个数字 {

    public  ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> a2=new ArrayList<>();
        if(array.length<=2){return a2;}
        int index1=0;
        int index2=array.length-1;
        int Plus=array[index1]+array[index2];
        int Mul=0;
        while(index1!=index2&&index1<array.length&&index2<array.length){
        	Plus=array[index1]+array[index2];
        	if(Plus<sum){index1++;}
        	else if(Plus>sum){index2--;}
        	else {
        		if(a2.size()==0){
        			a2.add(array[index1]);
        			a2.add(array[index2]);
        			Mul=array[index1]*array[index2];
        		}
        		else{
        			if(Mul>array[index1]*array[index2]){
        				a2.clear();
            			a2.add(array[index1]);
            			a2.add(array[index2]);
        			}
        			
        		index2--;
        		}        		
        	}
        }
        return a2;
    }
	public static void main(String[] args) {
		int[] a={1,3,5,7,8,9};
		FindNumbersWithSum(a, 12);
		

	}

}
