package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N102二叉树的层次遍历 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> TreeFirst = new Stack<>();
        TreeNode p = root;
        if(root!=null) {
            TreeFirst.add(root);
            List<Integer> resTemp1 = new ArrayList<>();
            resTemp1.add(root.val);
            res.add(resTemp1);
        }
        while(!TreeFirst.empty()){
            Stack<TreeNode> stackTemp = new Stack<>();
            List<Integer> resTemp = new ArrayList<>();
            while(!TreeFirst.empty()) {
                TreeNode temp = TreeFirst.pop();
                if (temp.left != null) {
                    stackTemp.push(temp.left);
                    resTemp.add(temp.left.val);
                }
                if (temp.right != null) {
                    stackTemp.push(temp.right);
                    resTemp.add(temp.right.val);
                }
            }
            if(!stackTemp.empty()){
                TreeFirst = (Stack<TreeNode>) stackTemp.clone();
                res.add(resTemp);
            }
        }
        return res;
    }
}
