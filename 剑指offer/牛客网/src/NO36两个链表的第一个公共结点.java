import java.util.Stack;





public class NO36两个链表的第一个公共结点 {
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1==null||pHead2==null)return null;
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        
        while(p1!=null){
        	s1.add(p1);
        	p1=p1.next;
        }while(p2!=null){
        	s2.add(p2);
        	p2=p2.next;
        }
        ListNode fin=null;
        while(p1==p2){
        	fin=p1;
        	if(s1.size()!=0&&s2.size()!=0){
	        	p1=s1.pop();
	        	p2=s2.pop();
        	}else{
        		break;
        	}
        }
        return fin;
    }
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(1);
		
		for(int i=2;i<4;i++){
			ListNode p=new ListNode(i);
			p.next=l1.next;
			l1.next=p;
		}
		for(int i=5;i<6;i++){
			ListNode p=new ListNode(i);
			p.next=l2.next;
			l2.next=p;
		}
		for(int i=6;i<8;i++){
			ListNode p=new ListNode(i);
			p.next=l2.next;
			l2.next=p;
			p.next=l1.next;
			l1.next=p;
		}
		FindFirstCommonNode(l1, l2);
	}

}
