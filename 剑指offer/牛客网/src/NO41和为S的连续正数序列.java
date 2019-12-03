import java.util.ArrayList;


public class NO41和为S的连续正数序列 {

    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        int index1=1;
        int index2=1;
        int num=index2-index1+1;
        int Plus=0;
        ArrayList<ArrayList<Integer>> a2=new ArrayList<>();
    	if(sum<1){return a2;}
        while(num>0){
        	num=index2-index1+1;
        	Plus=(index1+index2)*num/2;
        	if(Plus<sum){index2++;}
        	else if(Plus>sum){index1++;}
        	else {
        		if(num==1){
        			break;}
        		ArrayList<Integer> a=new ArrayList<>();
        		for(int i=index1;i<=index2;i++){
        			a.add(i);
        		}
        		a2.add(a);
        		index2++;

        		
        	}
        }
        return a2;
    }
	public static void main(String[] args) {
		FindContinuousSequence(1);

	}

}
