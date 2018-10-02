/**
 * 
 * 输入两个单调递增的链表，输出两个链表合成后的链表， 当然我们需要合成后的链表满足单调不减规则。
 * 
 */
public class Test16 {
	public static ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) { // 首先判断是否有链表为空
			return list2;
		} else if (list2 == null) {
			return list1;
		}
		ListNode end1 = list1;
		ListNode end2 = list2;
		ListNode tmp;		//end1和end2分别代表两个链表，tmp用于中间合成链表
		
		if (end1.val > end2.val) {//把首节点小的链表看作end1
			tmp = end1;
			end1 = end2;
			end2 = tmp;
		} else {

		}
		ListNode newNode = end1;//用于最终返回的链表首节点

		while (end1.next != null && end2.next != null) {   //将链表2中的元素插入链表1中合适的位置
			if (end1.val <= end2.val && end1.next.val >= end2.val) {
				tmp = end2.next;
				end2.next = end1.next;
				end1.next = end2;
				end1 = end2;
				end2 = tmp;
			} else {
				end1 = end1.next;
			}
		}
		
		if (end1.next == null) {//如果链表1到尾节点了则直接连接剩下的链表2中的首节点
			end1.next = end2;
			return newNode;
		} else {
			if (end1.next != null && end2.next == null) {//如果链表2到尾节点了则将链表2中所剩下的最后一个节点插入链表1
				while (end2 != null) {
					if (end1.val <= end2.val && end1.next.val >= end2.val) {
						end2.next = end1.next;
						end1.next = end2;
						break;
					} else {
						end1 = end1.next;
						if (end1.next == null) {//链表2最后的节点最大
							end1.next = end2;
							break;
						}
					}
				}
			}
			return newNode;
		}
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);
		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(6);
		System.out.println(Merge(list2, list1));
	}

	// 链表
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
