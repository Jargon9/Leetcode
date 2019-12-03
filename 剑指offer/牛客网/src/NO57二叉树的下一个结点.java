
public class NO57二叉树的下一个结点 {

	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	   public TreeLinkNode GetNext(TreeLinkNode pNode)
	    {
	        if(pNode.right!=null){
	        	while(pNode.right.left!=null){
	        		pNode.right=pNode.right.left;
	        	}
	        	return pNode.right;
	        }
	        while(pNode.next!=null){
	        	if(pNode.next.right==pNode){
	        		pNode=pNode.next;
	        	}
	        	else if(pNode.next.left==pNode){
	        		return pNode.next;
	        	}
	        }
        	return null;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
