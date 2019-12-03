

public class NO38二叉树的深度 {
	private static  class TreeNode {
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

	public static void main(String[] args) {
		TreeNode tree=new TreeNode(4);
		TreeNode tree1=new TreeNode(2);
		tree.left=tree1;
		TreeNode tree2=new TreeNode(6);
		tree.right=tree2;
		TreeNode tree3=new TreeNode(1);
		TreeNode tree4=new TreeNode(3);
		tree1.left=tree3;
		tree1.right=tree4;
		tree=null;
		System.out.println(TreeDepth(tree));

	}

}
