


public class NO26 {

	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	TreeNode p=null;
	TreeNode pstart=null;			
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null)return null;
	    Convert(pRootOfTree.left);
        if(p==null){
        	p=pstart=pRootOfTree;
        }
        else{
        	p.right=pRootOfTree;
        	pRootOfTree.left=p;
        	p=pRootOfTree;
        	}    	        
	    Convert(pRootOfTree.right);
	    return pstart;
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
		Convert(tree);

	}

}
