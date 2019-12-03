import java.util.*;

public class NO59之字型打印二叉树 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> array = new ArrayList<>();
    	ArrayList<TreeNode> Queue = new ArrayList<>();
    	ArrayList<TreeNode> Queue1 = new ArrayList<>();
    	ArrayList<Integer> mark = new ArrayList<>();
    	TreeNode p,q;
    	int mark1;
    	mark1=1;
        if(root==null){return array;}
    	p=root;
    	Queue.add(root);
    	Queue1.add(root);
    	mark.add(mark1);
    	while(Queue.size()!=0){
    		mark1=mark.get(0);
    		mark.remove(0);
    		if(mark1%2==0){
	    		p=Queue.get(0);
	    		array.add(p.val);
	    		q=Queue1.get(0);
	    		Queue.remove(0);
	    		Queue1.remove(0);
    		}
    		else{
	    		q=Queue1.get(0);
	    		array.add(q.val);
	    		p=Queue.get(0);
	    		Queue.remove(0);
	    		Queue1.remove(0);
    		}
    		++mark1;
	    		if(p.left!=null){
	    			Queue1.add( q.left);
	    			mark.add(mark1);
	    		}
	    		if(p.right!=null){
	    			Queue1.add( q.right);
	    			mark.add(mark1);
	    			}
    		
        		if(p.right!=null){
        			Queue.add(p.right);
        		}
        		if(p.left!=null){
        			Queue.add( p.left);
        			}
    		
    		
    	}
    	return array;
    	
    }
	public static void main(String[] args) {
		TreeNode p=new TreeNode(1);
		TreeNode s=new TreeNode(2);
		TreeNode s2=new TreeNode(3);
		TreeNode s3=new TreeNode(4);
		TreeNode s4=new TreeNode(5);
		
		p.right=s;
		p.left=s2;
		s2.left=s3;
		s.left=s4;
		System.out.println(PrintFromTopToBottom(p));
		

	}

}
