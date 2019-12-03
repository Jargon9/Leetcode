import java.lang.Math;


public class NO39平衡二叉树 {
	public static  class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
    public static  int TreeDepth(TreeNode root) {
    	if(root==null)return 0;
        if(root.left==null&&root.right==null){return 1;}
        int dep=0;
        dep=(TreeDepth(root.left)>=TreeDepth(root.right))?TreeDepth(root.left)+1:TreeDepth(root.right)+1;
        return dep;
    }
	   
	public static boolean IsBalanced_Solution(TreeNode root) {
	     if(root==null) return true;
	     if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right))>1) 
	    	 return false;
	     return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
