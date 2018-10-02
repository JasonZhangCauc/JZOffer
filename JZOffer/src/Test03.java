import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 */
public class Test03 {
	//利用栈完成
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
	//测试程序段
	public static void main(String[] args) {
		ListNode test=new ListNode(0);
		test.next=new ListNode(1).next=new ListNode(2);
		
		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList =printListFromTailToHead(test);
		System.out.println(arrayList);
	}

}
	//链表
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
                    this.val = val;
        }
  }


