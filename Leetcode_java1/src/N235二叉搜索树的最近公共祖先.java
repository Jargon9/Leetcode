import java.util.ArrayList;

public class N235二叉搜索树的最近公共祖先 {
    public static boolean pJudge = false, qJudge = false;
    static TreeNode  Ancestor = null;
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowestCommonAncestorTool(root, p, q);
        return Ancestor;
    }
    public static void lowestCommonAncestorTool(TreeNode root,TreeNode p, TreeNode q){
        if(Ancestor!=null) return;
        if(root!=null){
            if(root.left!=null) lowestCommonAncestorTool(root.left, p, q);
            if(root.right!=null) lowestCommonAncestorTool(root.right, p, q);
            if(root==p) pJudge=true;
            if(root==q) qJudge=true;
            if(pJudge==true&&qJudge==true&&Ancestor==null){
                Ancestor = root;
                return;
            }
        }
    }
    public static class TreeNode {
        public int val;
        public TreeNode left = null;
        public TreeNode right = null;
        TreeNode(String x) { val = Integer.parseInt(x); }
    }
    public static TreeNode x,y;
    public static TreeNode createTree(String[] nums){
        TreeNode root = new TreeNode(nums[0]);
        if(nums[0]=="2") x=root;
        if(nums[0]=="4") y=root;
        int num=1;
        ArrayList<TreeNode> floor = new ArrayList<>();
        floor.add(0, root);
        while(!floor.isEmpty()&&num < nums.length){
            TreeNode temp = floor.get(floor.size()-1);
            floor.remove(floor.size()-1);
            TreeNode left = null, right = null;
            if(num<nums.length)
                if(nums[num]!="null") {
                    left = new TreeNode(nums[num++]);
                    if(nums[num-1]=="2")
                        x=left;
                    if(nums[num-1]=="4")
                        y=left;
                }
                else{ left = null;
                    num++;}
            if(num<nums.length)
                if(nums[num]!="null") {
                    right = new TreeNode(nums[num++]);
                    if(nums[num-1]=="2")
                        x=right;
                    if(nums[num-1]=="4")
                        y=right;
                }
                else{
                    right = null;
                    num++;}
            if(left!=null) {
                temp.left = left;
                floor.add(0, left);
            }
            if(right!=null) {
                temp.right = right;
                floor.add(0, right);
            }
        }
        return root;
    }
    public static void main(String[] args){
        String[] s = {"6","2","8","0","4","7","9","null","null","3","5"};
        TreeNode root = createTree(s);
        TreeNode p = null,q,z;
        p = root;
        q = x;
        z = y;
        lowestCommonAncestor(root, q, z);
    }
}
