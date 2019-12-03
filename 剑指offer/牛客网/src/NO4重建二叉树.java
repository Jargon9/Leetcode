import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;


public class NO4重建二叉树 {
	 public static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 public static TreeNode reConstructBinaryTree(int [] pre,int [] in){
/*		 ArrayList<Integer> inLeft=new ArrayList<>();
		 ArrayList<Integer> inRight=new ArrayList<>();
		 ArrayList<Integer> preLeft=new ArrayList<>();
		 ArrayList<Integer> preRight=new ArrayList<>();*/
		 TreeNode root = new TreeNode(pre[0]);
		 int i=0;
		 while(in[i]!=pre[0]){ i++;}
		 int NoRoot=i;
		 int []inLeft = new int[i];
		 int []inRight = new int[pre.length-i-1];
		 int []preLeft = new int[i];
		 int []preRight = new int[pre.length-i-1];
		 if(preLeft.length>0){
			 for(int j=1;j<NoRoot+1;j++){
				 preLeft[j-1]=pre[j];
				 inLeft[j-1]=in[j-1];
			 }
		 }
		 if(preRight.length>0){
			 for(int j=NoRoot+1;j<pre.length;j++){
				 preRight[j-NoRoot-1]=pre[j];
				 inRight[j-NoRoot-1]=in[j];
			 }
		 }
		 if(preLeft.length>0)
			 root.left=reConstructBinaryTree(preLeft, inLeft);
		 if(preRight.length>0)
			 root.right=reConstructBinaryTree(preRight, inRight);
		 return root;
	 }
	public static void main(String[] args) {
		int []a={1,2,4,3,5,6};
		int []b={4,2,1,5,3,6};
		TreeNode root;
		root=reConstructBinaryTree(a,b);

	}

}
