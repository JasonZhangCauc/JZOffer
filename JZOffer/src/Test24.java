import java.util.ArrayList;

/**
 * 
 * 剑指offer编程题（JAVA实现)——第24题：二叉树中和为某一值的路径
 * 
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 *
 */
public class Test24 {

	ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null)
			return arr;// 初始树为空则返回
		list.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			// 避免listAll中所有引用都指向了同一个一个list重新new
			arr.add(new ArrayList<Integer>(list));
		}
		if (root.left != null) {
			FindPath(root.left, target);
		}
		if (root.right != null) {
			FindPath(root.right, target);
		}
		list.remove(list.size() - 1);// 移除最后一个元素递归查找
		return arr;

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
