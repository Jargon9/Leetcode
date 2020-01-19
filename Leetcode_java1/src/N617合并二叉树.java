import Tree.CreateTree;

import java.util.ArrayList;

public class N617合并二叉树 {
    public static class TreeNode {
        public int val;
        public TreeNode left = null;
        public TreeNode right = null;
        TreeNode(String x) { val = Integer.parseInt(x); }
    }
    public static TreeNode createTree(String[] nums){
        TreeNode root = new TreeNode(nums[0]);
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
                }
                else{ left = null;
                    num++;}
            if(num<nums.length)
                if(nums[num]!="null") {
                    right = new TreeNode(nums[num++]);
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
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1!=null||t2!=null){
            t1 = mergetool(t1, t2);
        }
        if((t1!=null&&t1.left!=null)||(t2!=null&&t2.left!=null)){
            t1.left = mergeTrees(t1.left, t2.left);
        }
        if((t1!=null&&t1.right!=null)||(t2!=null&&t2.right!=null)){
            t1.right = mergeTrees(t1.right, t2.right);
        }
        return t1;
    }
    public static TreeNode mergetool(TreeNode t1, TreeNode t2){
        if(t1!=null){
            if(t2!=null) t1.val = t1.val + t2.val;
            return t1;
        }
        else{
            if(t2!=null){
                return t2;
            }
        }
        return null;
    }
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
    public static void main(String[] args){
        String[] s1 = {"1","3","2","5"};
        String[] s ={"2","1","3","null","4","null","7"};

        TreeNode t = createTree(s);
        TreeNode t1 = createTree(s1);

        TreeNode res = mergeTrees(t1, t);

    }

}
