
/**
 * 
 * ����һ��������ת��������������ı�ͷ��
 *
 */
public class Test15 {
    public ListNode ReverseList(ListNode head) {
		if(head==null) {
			return null;
		}
    	ListNode new_node=null;
    	ListNode tmp=null;
    	ListNode pre=null;
    	while(head!=null) {
    		tmp=head.next;
    		head.next=pre;
    		if(tmp==null) 
    			new_node=head;
    		pre=head;
    		head=tmp;
    	}
    	
    	return new_node;

    }
    //���Դ�
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

