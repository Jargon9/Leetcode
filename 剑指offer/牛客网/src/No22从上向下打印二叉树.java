import java.util.ArrayList;
import java.util.Queue;


public class No22从上向下打印二叉树 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	    	ArrayList<Integer> array = new ArrayList<>();
	    	ArrayList<TreeNode> Queue = new ArrayList<>();
	    	TreeNode p,p1;
	    	p=root;
            if(root==null){return array;}
	    	Queue.add(root);
	    	while(Queue.size()!=0){
	    		p=Queue.get(Queue.size()-1);
	    		Queue.remove(Queue.size()-1);
	    		array.add(p.val);
	    		if(p.left!=null){Queue.add(0, p.left);}
	    		if(p.right!=null){Queue.add(0, p.right);}
	    		
	    	}
	    	return array;
	    	
	    }
	    
	    }

	public static void main(String[] args) {


	}

}
