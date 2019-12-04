package Tree;

import java.util.ArrayList;

public class N116填充每一个节点的下一个节点 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }
        public Node(String x) {
            val = Integer.parseInt(x);
            left = null;
            right = null;
            next = null;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public static Node createTree(String[] nums){
        Node root=null;
        if(nums.length>0) {
            root = new Node(nums[0]);
            int num = 1;
            ArrayList<Node> floor = new ArrayList<>();
            floor.add(0, root);
            while (!floor.isEmpty() && num < nums.length) {
                Node temp = floor.get(floor.size() - 1);
                floor.remove(floor.size() - 1);
                Node left = null, right = null;
                if (num < nums.length)
                    if (nums[num] != "null") {
                        left = new Node(nums[num++]);
                    } else {
                        left = null;
                        num++;
                    }
                if (num < nums.length)
                    if (nums[num] != "null") {
                        right = new Node(nums[num++]);
                    } else {
                        right = null;
                        num++;
                    }
                if (left != null) {
                    temp.left = left;
                    floor.add(0, left);
                }
                if (right != null) {
                    temp.right = right;
                    floor.add(0, right);
                }
            }
        }
        return root;
    }
        public static void MakeQueue(Node root, ArrayList<Node> queue){
        ArrayList<Node> TempQueue = new ArrayList<>();
        if(root!=null){
                TempQueue.add(root);
            }
            while(!TempQueue.isEmpty()){
                Node temp = new Node(TempQueue.get(0).val,TempQueue.get(0).left,
                        TempQueue.get(0).right,TempQueue.get(0).next );
                if(TempQueue.get(0).left!=null) {
                    TempQueue.add(TempQueue.get(0).left);
                    TempQueue.add(TempQueue.get(0).right);
                }
                queue.add(TempQueue.get(0));
                TempQueue.remove(0);
            }
        }
        public static Node connect(Node root) {
            ArrayList<Node> queue = new ArrayList<>();
            MakeQueue(root, queue);
            int mark=1,flag=1;
            for(int i=0;i<queue.size()-1;i++){
                if(i+1==flag){
                    flag = flag + mark*2;
                    mark = mark * 2;
                    queue.get(i).next=null;
                }
                else{
                    queue.get(i).next=queue.get(i+1);
                }
            }
            if(queue.size()>0)
            return queue.get(0);
            return null;
        }
        public static void main(String[] args){
            String[] s = {};
            Node root = createTree(s);
            Node mark = connect(root);
        }

}
