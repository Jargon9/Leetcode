import Tree.CreateTree;

public class N101对称二叉树 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
//    N257二叉树的所有路径.TreeNode s = new N257二叉树的所有路径.TreeNode();
    public static boolean isSymmetric(CreateTree.TreeNode root) {
        if(root!= null)
        return NodeCheck(root.left, root.right);
        return false;
    }
    public static boolean NodeCheck(CreateTree.TreeNode Node1, CreateTree.TreeNode Node2){
        if(Node1==null&&Node2==null){
            return true;
        }
        if(Node1!=null && Node2!=null && Node1.val==Node2.val){
            boolean N1 = NodeCheck(Node1.left, Node2.right);
            boolean N2 = NodeCheck(Node1.right, Node2.left);
            return (N1&&N2);
        }
        else {
            return false;
        }
    }
//    public static boolean isSymmetric(TreeNode root) {
//        if(root!= null)
//            return NodeCheck(root.left, root.right);
//        return false;
//    }
//    public static boolean NodeCheck(TreeNode Node1, TreeNode Node2){
//        if(Node1==null&&Node2==null){
//            return true;
//        }
//        if(Node1!=null && Node2!=null && Node1.val==Node2.val){
//            boolean N1 = NodeCheck(Node1.left, Node2.right);
//            boolean N2 = NodeCheck(Node1.right, Node2.left);
//            return (N1&&N2);
//        }
//        else {
//            return false;
//        }
//    }
    public static void main(String[] args){
        String[] s = {"1", "2", "2", "3", "4", "3", "3"};
        CreateTree.TreeNode Tree = CreateTree.createTree(s);
        System.out.println(isSymmetric(Tree));
    }

}
