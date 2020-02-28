public class N5317删除给定值的叶子节点 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        boolean[] judge = new boolean[2];
        judge[0] = true;
        while(judge[0]==true){
            delete(root, target, judge);
            if(root==null) break;
            judge[1] = false;
        }
        return root;
    }
    public TreeNode delete(TreeNode root, int target, boolean[] judge){
        if(judge[1]==true||root==null) return root;
        if(judge[1]==false) judge[0] = false;
        if(root!=null&&root.left==null&&root.right==null&&root.val==target) {
            judge[0] = true;
            judge[1] = true;
            return null;
        }
        root.left = delete(root.left, target, judge);
        root.right = delete(root.right, target, judge);
        return root;
    }
}
