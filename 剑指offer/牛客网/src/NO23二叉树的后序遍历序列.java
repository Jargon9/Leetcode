
public class NO23二叉树的后序遍历序列 {

    public static boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length<=1)return true;
        int leftroot=-1;
        int length=sequence.length;
        for(int i=0;i<length;i++){
        	if(sequence[i]>=sequence[length-1])
        	{
        		leftroot=i-1;
        		break;
        	}
        }
        int []left=new int[leftroot+1];
        int []right=new int[length-leftroot-2];
        for(int i=0;i<length-1;i++){
        	if(i<=leftroot){left[i]=sequence[i];}
        	if(i>leftroot){
        		if(sequence[i]<sequence[length-1]){return false;}
        		right[i-leftroot-1]=sequence[i];
        		}
             }
    	
    	return VerifySquenceOfBST(left)&&VerifySquenceOfBST(right);
    }
	public static void main(String[] args) {
		int []test={4,6,7,5};
		System.out.println(VerifySquenceOfBST(test));

	}

}
