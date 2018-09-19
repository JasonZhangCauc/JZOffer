/**
 * 
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 */
public class Test14 {
	//定义两个快慢指针，快指针先走k步，两个一起走，快指针指向空慢指针位置即为倒数第k个结点
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<1) {
			return null;
		}
		ListNode fast = head,slow=head;
		
		for(int i=1;i<k;i++) {//k过大
			if(fast.next!=null) {
				fast=fast.next;
			}else {
				return null;
			}
		}
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		return slow;

    }
	//系统自带
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}

