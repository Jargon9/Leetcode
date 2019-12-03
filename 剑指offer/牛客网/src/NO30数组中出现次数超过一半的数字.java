
public class NO30数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int []a=new int[500];
        for(int i=0;i<array.length;i++){
        	a[array[i]]++;
        	if(a[array[i]]>array.length/2){
        		return 1;
        	}        	
        }
        return 0;
    }
    public int MoreThanHalfNum_Solution1(int [] array) {
    	int num,temp;
    	temp=array[0];
    	num = 1;
    	for(int i=1;i<array.length;i++){
    		if(array[i]==temp){num++;}
    		else{
    			num--;
    			if(num==0){
    				temp=array[i];
    			}
    		}
    	}
    		num=0;
    		for(int k=0;k<array.length;k++){
    			if(array[k]==temp){
    				num++;
    			}
    		}
    		if(num>array.length/2){return temp;}    		
    		return 0;
    	
    }

	public static void main(String[] args) {
		

	}

}
