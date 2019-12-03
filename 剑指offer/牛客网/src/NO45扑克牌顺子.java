
public class NO45扑克牌顺子 {

    public static boolean isContinuous(int [] numbers) {
    	if(numbers.length!=5)return false;
    	int []mark=new int[14];
    	for(int i=0;i<numbers.length;i++){
    		mark[numbers[i]]++;
    	}
    	int i;
    	for(i=1;i<numbers.length;i++){
    		if(mark[i]==1){
    			break;
    		}
    	}
    	for(int j=i+1;j<i+5;j++){
    		if(mark[j]!=1){
    			if(mark[0]>0){
    				mark[0]--;
    				continue;
    			}
    			return false;
    			}
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={0,3,1,6,4};
		System.out.println(isContinuous(a));
	}

}
