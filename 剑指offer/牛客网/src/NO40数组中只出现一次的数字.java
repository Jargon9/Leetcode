import java.util.Stack;


public class NO40数组中只出现一次的数字 {

    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		int resultExclusiveOR=0;
		for(int i=0;i<array.length;i++){
			resultExclusiveOR^=array[i];
		}
		int ind=0;
		int temp=resultExclusiveOR%2;
		while(temp==0){
			
			resultExclusiveOR=resultExclusiveOR>>1;
			ind++;
			temp=resultExclusiveOR%2;
		}
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		for(int i=0;i<array.length;i++){
			int temp2=array[i];
			for(int j=0;j<ind;j++){
				temp2=array[i]>>1;
			}
			if(temp2%2==1){
				s1.add(array[i]);
			}else{
				s2.add(array[i]);
			}
		}
		resultExclusiveOR=s1.pop();
		while(s1.size()!=0){
			resultExclusiveOR^=s1.pop();
		}
		num1[0]=resultExclusiveOR;
		resultExclusiveOR=s2.pop();
		while(s2.size()!=0){
			resultExclusiveOR^=s2.pop();
		}
		num2[0]=resultExclusiveOR;
    }
	public static void main(String[] args) {
		int []a={43,23,24,43,23,25};
		int []a1=new int[1];
		int []a2=new int[1];
		FindNumsAppearOnce(a, a1, a2);
	}

}
