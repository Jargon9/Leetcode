
public class NO35数组中的逆序对 {
/*    public static int InversePairs(int [] array) {
    	int Pnum=0;
    	for(int i=0;i<array.length;i++){
    		for(int j=i;j<array.length;j++){
    			if(array[i]>array[j]){
    				Pnum++;
    			}
    		}
    	}
        return Pnum;
    }*/
/*	public static int InversePairs(int [] array){
		int NumLeft=0;
		int Numright=0;
		int FinNum=0;
		int[] left;
		int[] right;		
		if(array.length==1)return 0;
		if(array.length%2==0){
			left=new int[array.length/2];
			for(int i=0;i<array.length/2;i++){
				left[i]=array[i];
			}
			right=new int[array.length/2];
			for(int i=0;i<array.length/2;i++){
				right[i]=array[i-array.length/2];
			}
		}
		else{
			left=new int[array.length/2+1];
			for(int i=0;i<array.length/2+1;i++){
				left[i]=array[i];
			}
			right=new int[array.length/2];
			for(int i=0;i<array.length/2;i++){
				right[i]=array[i-array.length/2-1];
			}
		}
		int p1=left.length-1;
		int p2=right.length-1;
		int time=array.length;
		while(time!=0){
			if(left[p1]>right[p2]){
				FinNum=FinNum+p2+1;
				array[time]=left[p1];
				p1--;
				time--;
			}
			else()
		}
	}*/

		static int  InversePairs(int[] data) {
		       int length=data.length;
		        if(length<=0)
		            return 0;
		       //vector<int> copy=new vector<int>[length];
		       int[] copy=new int[length];
		       for(int i=0;i<length;i++)
		           copy[i]=data[i];
		       long  count=InversePairsCore(data,copy,0,length-1);
		       //delete[]copy;
		       return (int)(count%1000000007);
		    }
		static long  InversePairsCore(int[] data,int[] copy,int start,int end)
		    {
		       if(start==end)
		          {
		            copy[start]=data[start];
		            return 0;
		          }
		       int length=(end-start)/2;
		       long  left=InversePairsCore(copy,data,start,start+length);
		       long  right=InversePairsCore(copy,data,start+length+1,end); 
		        
		       int i=start+length;
		       int j=end;
		       int indexcopy=end;
		       long  count=0;
		       while(i>=start&&j>=start+length+1)
		          {
		             if(data[i]>data[j])
		                {
		                  copy[indexcopy--]=data[i--];
		                  count=count+j-start-length;          //count=count+j-(start+length+1)+1;
		                }
		             else
		                {
		                  copy[indexcopy--]=data[j--];
		                }          
		          }
		       for(;i>=start;i--)
		           copy[indexcopy--]=data[i];
		       for(;j>=start+length+1;j--)
		           copy[indexcopy--]=data[j];       
		       return left+right+count;
		    }
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(a));

	}

}
