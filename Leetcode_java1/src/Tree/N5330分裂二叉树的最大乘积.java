package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class N5330分裂二叉树的最大乘积 {
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
    public static   Map<TreeNode, Integer> sumMap = new HashMap<>();
    public static int maxProduct(TreeNode root) {
        int max=0, sum = tool(root);
        for(TreeNode temp : sumMap.keySet()){
            max = Math.max(max, (sum-sumMap.get(temp))*sumMap.get(temp));
        }
        return max;
    }
    public static int tool(TreeNode root){
        int left=0, right=0;
        if(root.left!=null){
            sumMap.put(root.left, tool(root.left));
        }
        if(root.right!=null){
            sumMap.put(root.right, tool(root.right));
        }
        left = sumMap.containsKey(root.left)? sumMap.get(root.left):0;
        right = sumMap.containsKey(root.right)? sumMap.get(root.right):0;
        return left + right + root.val;
    }
}
