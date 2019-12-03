import jdk.internal.dynalink.beans.StaticClass;


public class NO62二叉搜索树的第k个节点 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    	}
	    }
	TreeNode plast;
	int index=0;
    TreeNode KthNode(TreeNode pRoot,  int  k){
    	if (pRoot==null) return plast;
        KthNode(pRoot.left, k);
        index++;
        if(index==k){
        	plast=pRoot;
        }
        KthNode(pRoot.right, k);
        
    	return plast;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
