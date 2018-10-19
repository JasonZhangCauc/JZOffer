import java.util.HashMap;

/**
 * 
 * 剑指offer编程题（JAVA实现)——第25题：复杂链表的复制
 * 
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 */

public class Test25 {

	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead==null) {
			return null;
		}
		//一个Node对应源链表，另一个Node对应复制的链表
		HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode head = pHead;
		//先将节点全部复制
		while(head!=null) {
			map.put(head, new RandomListNode(head.label));
			head = head.next;
		}
		head = pHead;
		while(head != null) {
			//key对应源表的每一个节点，value对应复制链表的每一个节点
			map.get(head).next = map.get(head.next);
			map.get(head).random = map.get(head.random);
			head = head.next;
		}
		
		return map.get(pHead);
    }
}
