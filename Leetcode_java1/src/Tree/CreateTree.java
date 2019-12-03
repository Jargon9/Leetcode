package Tree;

import java.util.ArrayList;

public class CreateTree {
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
}
