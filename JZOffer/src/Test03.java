import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 *
 */
public class Test03 {
	//����ջ���
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
			ArrayList<Integer> arrayList=new ArrayList<Integer>();
			Stack<ListNode> stack = new Stack<>();
	        while (listNode != null) {
	            stack.push(listNode);
	            listNode = listNode.next;
	        }
	        ListNode tmp;
	        while (!stack.isEmpty()) {
	            tmp = stack.pop();
	            arrayList.add(tmp.val);
	        }
			return arrayList;
	        
	    }
	//���Գ����
	public static void main(String[] args) {
		ListNode test=new ListNode(0);
		test.next=new ListNode(1).next=new ListNode(2);
		
		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList =printListFromTailToHead(test);
		System.out.println(arrayList);
	}

}
	//����
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
                    this.val = val;
        }
  }


