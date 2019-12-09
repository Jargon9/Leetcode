

public class N141环形链表 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static boolean hasCycle(ListNode head){
        ListNode x1,x2;
        x1=head;
        x2=head;
        while(x1!=null&&x2!=null){
            x1 = x1.next;
            x2 = x2.next;
            if(x2!=null){
                x2=x2.next;
            }
            else return false;
            if(x1==x2) return true;
        }
        return false;
    }
    public static void main(String[] args){
        ListNode x1=new ListNode(1);
        ListNode x2=new ListNode(2);
        x1.next=x2;
        System.out.println(hasCycle(x1));
    }


}
