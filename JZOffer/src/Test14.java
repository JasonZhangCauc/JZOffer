/**
 * 
 * ����һ����������������е�����k����㡣
 *
 */
public class Test14 {
	//������������ָ�룬��ָ������k��������һ���ߣ���ָ��ָ�����ָ��λ�ü�Ϊ������k�����
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<1) {
			return null;
		}
		ListNode fast = head,slow=head;
		
		for(int i=1;i<k;i++) {//k����
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
	//ϵͳ�Դ�
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}

