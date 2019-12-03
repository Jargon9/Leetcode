
public class NO46孩子们的游戏 {
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
    public static int LastRemaining_Solution(int n, int m) {
    	if(n==0){
    		return 0;
    	}
		ListNode phead=new ListNode(0);
        ListNode p2=phead;
    	for(int i=1;i<n;i++){
            ListNode p1=new ListNode(i);
            p2.next=p1;
            p2=p2.next;                        
        }
    	p2.next=phead;
    	ListNode p;
    	p=phead;
    	while(n>1){
    		if(p.next!=null){
	    		for(int i=2;i<m;i++){
	    			p=p.next;
	    		}
	    		p.next=p.next.next;
	    		p=p.next;
	    		n--;
    		}
    	}
    	return p.val;
    }
	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(5, 3));
	}

}
