package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N94BinaryTreeInorderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public static List<Integer> inorderTraversal1(TreeNode root){
       List<Integer> list=new ArrayList<>();  //list与Arraylist差别是什么？
        Traversal(list,root);
       return list;
    }
    public static void Traversal(List<Integer> list,TreeNode root){
        if(root.left!=null)Traversal(list,root.left);
        list.add(root.val);
        if(root.right!=null)Traversal(list,root.right);
    }
    public static List<Integer> inorderTraversal(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        return list;
    }

}
