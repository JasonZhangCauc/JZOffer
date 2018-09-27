/**
 * ���������������������������������ϳɺ������ ��Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 */
public class Test16 {
	public static ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null) { // �����ж��Ƿ�������Ϊ��
			return list2;
		} else if (list2 == null) {
			return list1;
		}
		ListNode end1 = list1;
		ListNode end2 = list2;
		ListNode tmp;		//end1��end2�ֱ������������tmp�����м�ϳ�����
		
		if (end1.val > end2.val) {//���׽ڵ�С��������end1
			tmp = end1;
			end1 = end2;
			end2 = tmp;
		} else {

		}
		ListNode newNode = end1;//�������շ��ص������׽ڵ�

		while (end1.next != null && end2.next != null) {   //������2�е�Ԫ�ز�������1�к��ʵ�λ��
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
		
		if (end1.next == null) {//�������1��β�ڵ�����ֱ������ʣ�µ�����2�е��׽ڵ�
			end1.next = end2;
			return newNode;
		} else {
			if (end1.next != null && end2.next == null) {//�������2��β�ڵ���������2����ʣ�µ����һ���ڵ��������1
				while (end2 != null) {
					if (end1.val <= end2.val && end1.next.val >= end2.val) {
						end2.next = end1.next;
						end1.next = end2;
						break;
					} else {
						end1 = end1.next;
						if (end1.next == null) {//����2���Ľڵ����
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

	// ����
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
