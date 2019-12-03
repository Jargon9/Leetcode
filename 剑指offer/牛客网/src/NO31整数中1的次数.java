
public class NO31整数中1的次数 {
/*    public static int NumberOf1Between1AndN_Solution(int n) {
    	int num=0;
        for(int i=1;i<=n;i++){
        	int k=i;
        	while(k!=0){
        		if(k%10==1)
        		{num++;}
        		k=k/10;
        	}
        }
        return num;
        	
        
    }*/
    public static int NumberOf1Between1AndN_Solution(int n) {
    	int num=0;
    	int k=n;
    	int ind=1;
    	while(k!=0){
    		if(k%10>=1)num=num+(k%10+1)*(10^k);
    		k=k/10;
    	}
        return num;
        	
        
    }

	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(113));

	}

}
