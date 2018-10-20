/**
 * 
 * 剑指offer编程题（JAVA实现)——第38题：二叉树的深度
 * 
 * 题目描述
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 *
 */
public class Test38 {

	public static void main(String[] args) {
		
		

	}

	public int TreeDepth(TreeNode root) {
		
		return depth(root,0);
    }
	
	private int depth(TreeNode root, int i) {
		if (root == null) {
			return 0;
		}
		i = i + 1;
		TreeNode tmp = root;
		int left = 0;
		int right = 0;
		if (tmp.left != null) {
			left = depth(tmp.left, i);
		}

		if (tmp.right != null) {
			right = depth(tmp.right, i);
		}
		return Math.max(i, Math.max(left, right));
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
    public int TreeDepth(TreeNode root) {
                if(root==null){
            return 0;
        }
           
        int nLelt=TreeDepth(root.left);
        int nRight=TreeDepth(root.right);
         
        return nLelt>nRight?(nLelt+1):(nRight+1);
    }
}

*/
