
public class NO33连续子数组的最大和 {
	
    public static int FindGreatestSumOfSubArray(int[] array) {
        int[]b =new int[array.length];
        int tempNum=0;
        int tempNum1=0;
        int max=array[0];
        int j,last;
        last=0;
        for(int i=0;i<array.length;i++){
        	if(max<array[i]){max=array[i];}
    		tempNum=tempNum+array[i];
        	if(tempNum>0){
        		last=i;
        		tempNum=0;
        	}
        }
        
        for(int i=0;i<last;i++){
        	tempNum1=array[i]+tempNum1;
        	if(tempNum1<0){
        		b[i]=-1;
        		tempNum1=0;
        		}
        	else{b[i]=1;}
        }
        if(last!=0){
	        j=last-1;
	        tempNum=array[last];
	        while(j>=0&&b[j]>0){
	        	tempNum=tempNum+array[j];
	        	j--;
	        }
	        return tempNum;
        }
        return max;
    }
	public static void main(String[] args) {
		int []a={2,8,1,5,9};
		System.out.println(FindGreatestSumOfSubArray(a));

	}

}
