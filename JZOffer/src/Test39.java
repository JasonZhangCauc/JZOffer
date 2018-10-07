
/**
 * 
 * 平衡二叉树
 * 
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 */
public class Test39 {


	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		return (Math.abs(isDepth(root.left) - isDepth(root.right)) <= 1) && IsBalanced_Solution(root.left)
				&& IsBalanced_Solution(root.right);
	}

	public int isDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(isDepth(root.left), isDepth(root.right));
	}
}
//上面的做法有很明显的问题，在判断上层结点的时候，会多次重复遍历下层结点，增加了不必要的开销。
//如果改为从下往上遍历，如果子树是平衡二叉树，则返回子树的高度；
//如果发现子树不是平衡二叉树，则直接停止遍历，这样至多只对每个结点访问一次。

//其他做法
/**
public boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root) != -1;
	}

	private int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = getDepth(root.left);
		if (left == -1)
			return -1;
		int right = getDepth(root.right);
		if (right == -1)
			return -1;
		return Math.abs(right - left) > 1 ? -1 : 1+Math.max(left, right);
	} 

*/
