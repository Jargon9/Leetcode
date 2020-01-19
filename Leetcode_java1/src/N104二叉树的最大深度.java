import java.util.TreeMap;

public class N104二叉树的最大深度 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
