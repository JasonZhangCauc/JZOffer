/**
 * 
 * 二叉搜索树与双向链表
 * 
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * (是指不能new新的结点)
 */
public class Test26 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public class Solution {
	    public TreeNode Convert(TreeNode pRootOfTree) {
			if(pRootOfTree==null) {
				return null;
			}
			if(pRootOfTree.left==null&&pRootOfTree.right==null) {
				return pRootOfTree;
			}
			
			TreeNode left = Convert(pRootOfTree.left);
			TreeNode p = left;
			if(p!=null&&p.right!=null) {
				while(p.right!=null) {
					p = p.right;
				}
			}
			//p为左子树最右节点
			if(left!=null) {
				p.right=pRootOfTree;
				pRootOfTree.left=p;
			}
			TreeNode right = Convert(pRootOfTree.right);
	    	if(right!=null) {
	    		right.left=pRootOfTree;
	    		pRootOfTree.right=right;
	    	}
	    	
	    	return left != null ? left : pRootOfTree;
	        
	    }
	}
}
