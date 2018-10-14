/**
 * 
 * 剑指offer编程题（JAVA实现)——第18题：二叉树的镜像
 * 
 * 题目描述
	操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
	二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 *
 */
public class Test18 {
	//递归思想实现
	public void Mirror(TreeNode root) {
		if (root != null) {
			TreeNode start = root;
			if (start.left != null || start.right != null) {
				TreeNode tmp = start.left;
				start.left = start.right;
				start.right = tmp;
				Mirror(start.left);
				Mirror(start.right);
			}
		}
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
