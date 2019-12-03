import java.util.ArrayList;


public class NO31最小的K个数 {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> a =new ArrayList<>();
        int temp1,temp2;
        if(k>input.length){return a;}
    	for(int i=0;i<k;i++){
        	a.add(input[i]);
        }
    	for(int i=k;i<input.length;i++){
			temp1=input[i];
    		for(int j=0;j<k;j++){
    			if(a.get(j)>temp1){
    				temp2=a.get(j);
    				a.set(j, temp1);
    				temp1=temp2;
    				}    				
    			}
    		}
    	return a;
    	}
    
	public static void main(String[] args) {
		int []a={1,5,6,9,8,4,2};
		ArrayList<Integer> b;
		b=GetLeastNumbers_Solution(a, 4);
		for(int i=0;i<4;i++){
			System.out.print(b.get(i));
		}
	}

}
