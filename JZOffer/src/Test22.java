import java.util.ArrayList;
import java.util.Stack;


/**
 * 
 * 从上往下打印出二叉树
 * 
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 */
public class Test22 {

	ArrayList<Integer> arrayList = new ArrayList<>();
	// 每层依次入栈
	Stack<TreeNode> stack1 = new Stack<>();
	// 从stack1出栈的元素依次加入stack2，统一通过stack2找到他们的字节点并压入stack1
	Stack<TreeNode> stack2 = new Stack<>();

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

		if (root == null) {
			return arrayList;// 空则返回
		}
		stack1.push(root);
		while (!stack1.isEmpty()) {
			while (!stack1.isEmpty()) {
				TreeNode tmp = stack1.pop();
				arrayList.add(tmp.val);
				stack2.push(tmp);
			}
			while (!stack2.isEmpty()) {
				TreeNode tmp2 = stack2.pop();
				// 从左到右打印，所以右子树先入栈
				if (tmp2.right != null) {
					stack1.push(tmp2.right);
				}
				if (tmp2.left != null) {
					stack1.push(tmp2.left);
				}
			}
		}

		return arrayList;

	}

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

}
//其他方法
/**
public class Solution {
     public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
         ArrayList<Integer> list = new ArrayList<Integer>();
         if(root == null) return list;
         Deque<TreeNode> deque = new LinkedList<TreeNode>();
         
         deque.add(root);
         while(!deque.isEmpty()){
             TreeNode t = deque.pop();
             list.add(t.val);
             if(t.left != null) deque.add(t.left);
             if(t.right != null) deque.add(t.right);
         }
         return list;
     }
}
*/