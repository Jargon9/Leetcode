import java.util.ArrayList;



public class NO60把二叉树打印成多行 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}

    static ArrayList<ArrayList<Integer> > Print(TreeNode root) {
    	ArrayList<ArrayList<Integer>> array = new ArrayList<>(); 
    	ArrayList<Integer> array1 = new ArrayList<>();
    	ArrayList<TreeNode> Queue = new ArrayList<>();
    	ArrayList<Integer> mark = new ArrayList<>();
    	TreeNode p,q;
    	int mark1,floor;
    	floor=mark1=1;
        if(root==null){return array;}
    	p=root;
    	Queue.add(root);
    	mark.add(mark1);
    	while(Queue.size()!=0){
    		mark1=mark.get(0);
    		mark.remove(0);
    		if(floor==mark1){    			
	    		p=Queue.get(0);
	    		array1.add(p.val);
	    		Queue.remove(0);
    		}
    		else{
    			floor=mark1;
    	    	ArrayList<Integer> array2 = new ArrayList<>();
    	    	for(int i=0;i<array1.size();i++){
    	    		array2.add(array1.get(i));
    	    	}
    	    	array.add(array2);
    	    	array1.clear();
	    		p=Queue.get(0);
	    		array1.add(p.val);
	    		Queue.remove(0);
    			
    		}
    		

    		++mark1;
    		if(p.right!=null){
    			Queue.add( p.right);
    			mark.add(mark1);
    			}
	    		if(p.left!=null){
	    			Queue.add( p.left);
	    			mark.add(mark1);
	    		}

    		
    		
    		
    	}
    	ArrayList<Integer> array2 = new ArrayList<>();
    	for(int i=0;i<array1.size();i++){
    		array2.add(array1.get(i));
    	}
    	array.add(array2);
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
		System.out.println(Print(p));

	}

}
