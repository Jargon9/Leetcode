import No3从尾到头打印链表.ListNode;




public class NO14链表中的倒数第k个节点 {
	public static class ListNode {
		int val;
		ListNode next = null;
	
		ListNode(int val) {
		this.val = val;
	}
		public void addNode(int data){
			ListNode s=new ListNode(data);
			next = s;
		}
}
	
    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){return null;}
        if(k<=0){return null;}
    	ListNode s;
    	ListNode sk;
    	s=head;
        sk=head;
    	for(int i=0;i<k-1;i++){
            if(s.next==null){return null;}
            else{s=s.next;}
        }
    	while(s.next!=null){
    		s=s.next;
    		sk=sk.next;
    	}
    	return sk;
    }
	public static void main(String[] args) {
		 ListNode s = new ListNode(0);
/*		 s.addNode(2);
		 System.out.println(FindKthToTail(s,1).val);*/

	}

}
