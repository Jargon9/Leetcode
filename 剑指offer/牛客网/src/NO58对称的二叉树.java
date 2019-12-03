
public class NO58对称的二叉树 {

	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
    public static void Mirror(TreeNode root) {
        if(root!=null){
	        TreeNode p;
	        p=root.left;
	        root.left=root.right;
	        root.right=p;
	        Mirror(root.left);
	        Mirror(root.right);
        }
    }
    public static boolean isequal(TreeNode p1,TreeNode p2){
    	if(p1==null||p2==null){
    		if(p1==p2)return true;
    		else return false;
    	}
    	if(p1.val!=p2.val) return false;
    	boolean left=isequal(p1.left, p2.left);
    	boolean right=isequal(p1.right, p2.right);
    	return left&&right;
    }
    public static TreeNode create(TreeNode p1,TreeNode p2){
    	if(p1==null)return p2 ;
    	TreeNode s=new TreeNode(p1.val);
    	p2=s;
    	p2.left=create(p1.left, p2.left);
    	p2.right=create(p1.right, p2.right);
    	return p2;
    }
    static boolean  isSymmetrical(TreeNode pRoot)
    {
        TreeNode mirr=null;
        mirr=create(pRoot,mirr);
        Mirror(pRoot);
        return isequal(mirr, pRoot);
        
    }
	public static void main(String[] args) {
		TreeNode p=new TreeNode(1);
		TreeNode s=new TreeNode(2);
		TreeNode s2=new TreeNode(2);
		p.right=s;
		p.left=s2;
		System.out.println(isSymmetrical(p));

	}

}
