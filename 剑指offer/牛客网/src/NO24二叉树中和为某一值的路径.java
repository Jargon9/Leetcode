import java.util.ArrayList;


public class NO24二叉树中和为某一值的路径 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
    static ArrayList<ArrayList<Integer>> array=new ArrayList<>();	
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
       ArrayList<Integer> array1=new ArrayList<>();
   	   if(root==null||target==0)return array;
       JudgePath(root, target, array1,0);
       return array;
       
    }
    public static void JudgePath(TreeNode root,int target,ArrayList<Integer> array2 ,int floor){
    	if(array2.size()==0){array2.add(root.val);}
    	else{array2.add(array2.size(), root.val);}
    	target=target-root.val;
    	if(root.left==null||root.right==null){
    		if(target==0){
	    		array.add(new ArrayList<Integer>(array2));
	    		array2.remove(array2.size()-1);
    		}
    	}
    	if(target<0){
    		array2.remove(array2.size()-1);
    		return;
    		}
    	if(root.left!=null){
    		JudgePath(root.left, target, array2,floor+1);
    	}
    	if(root.right!=null){
    		JudgePath(root.right, target, array2,floor+1);
    	}
    	if(array2.size()!=floor){array2.remove(array2.size()-1);}
    }
    
	public static void main(String[] args) {
		TreeNode tree=new TreeNode(10);
		TreeNode tree1=new TreeNode(5);
		tree.left=tree1;
		TreeNode tree2=new TreeNode(12);
		tree.right=tree2;
		TreeNode tree3=new TreeNode(4);
		TreeNode tree4=new TreeNode(7);
		tree1.left=tree3;
		tree1.right=tree4;
		FindPath(tree, 22);
		for(int i=0;i<array.get(0).size();i++)
			System.out.println(array.get(0).get(i));

	}
	
}
