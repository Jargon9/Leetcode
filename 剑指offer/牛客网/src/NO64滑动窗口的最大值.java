import java.util.ArrayList;


public class NO64滑动窗口的最大值 {

    public static  ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> Max=new ArrayList<>();
        if(num.length==0||size==0)return Max;
        if(size>num.length)return Max;
        int max=num[0];       
        int i,mark;
        mark=0;
        for(i=1;i<size;i++){
        	if(num[i]>max){
        		max=num[i];
        		mark=i;
        	}
        }
        Max.add(max);
        for(;i<num.length;i++){
    		if(mark==i-size){
    				mark++;
        			max=num[mark];        			
        			for(int j=mark+1;j<i+1;j++){
        				if(num[j]>max){
        					max=num[j];
        					mark=j;
        				}
        			}
        			Max.add(max);
        		}
    		else{
    			if(num[i]>max){
    				Max.add(num[i]);
    				mark=i;
    				max=num[i];
    			}
    			else{
    				Max.add(max);
    			}
    		}
        	
        	}
        
        return Max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sum={16,14,12,10,8,6,4};
		System.out.println(maxInWindows(sum, 5));
	}

}
