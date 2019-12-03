public class N61RotateList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode( int x) {val = x;}
    }
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode p1=head,p3=null,head1;
        int len=0;
        while(p1!=null){
            len++;
            if(p1.next==null){
                p3=p1;
            }
            p1=p1.next;
        }
        p1=head;
        k=k%len;
        for(int i=0;i<len-k;i++){
            p1=p1.next;
        }
        head1=p1;
        p3.next=head;
        return head1;

    }
    public static void main(String[] arg){
        int[]a ={1,2,3,4,5};
        ListNode head=new ListNode(1);
        ListNode p1=head;
        for(int i=1;i<a.length;i++){
            ListNode p2=new ListNode(a[i]);
            p1.next=p2;
            p1=p1.next;
        }
        ListNode head1=rotateRight(head, 2);
        for(int i=0;i<a.length;i++){
            System.out.println(head1.val);
            head1=head1.next;
        }
    }

}
