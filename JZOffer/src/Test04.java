/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ�����������
 * �����Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������
 * {4,7,2,1,5,3,8,6}�����ؽ������������ء�
 * 
 */
public class Test04 {
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		
		 return construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	        
	    }
	/**
	 * 
	 * @param preorder ǰ�����
     * @param ps       ǰ������Ŀ�ʼλ��
     * @param pe       ǰ������Ľ���λ��
     * @param inorder  �������
     * @param is       ��������Ŀ�ʼλ��
     * @param ie       ��������Ľ���λ��
	 * @return TreeNode ���ĸ����
	 * @exception 
	 */
	 public static TreeNode construct(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {

	        // ��ʼλ�ô��ڽ���λ��˵���Ѿ�û����Ҫ�����Ԫ����
	        if (ps > pe) {
	            return null;
	        }
	        // ȡǰ������ĵ�һ�����֣����ǵ�ǰ�ĸ����
	        int val = preorder[ps];
	        int index = is;
	        // ������������������Ҹ�����λ��
	        while (index <= ie && inorder[index] != val) {
	            index++;
	        }

	        // ������������������������û���ҵ���˵������Ĳ����ǲ��Ϸ��ģ��׳��쳣
	        if (index > ie) {
	            throw new RuntimeException("Invalid input");
	        }

	        // ������ǰ�ĸ���㣬����Ϊ��㸳ֵ
	        TreeNode node = new TreeNode(val);

	        // �ݹ鹹����ǰ����������������������Ԫ�ظ�����index-is+1��
	        // ��������Ӧ��ǰ�������λ����[ps+1, ps+index-is]
	        // ��������Ӧ�����������λ����[is, index-1]
	        node.left = construct(preorder, ps + 1, ps + index - is, inorder, is, index - 1);
	        // �ݹ鹹����ǰ����������������������Ԫ�ظ�����ie-index��
	        // ��������Ӧ��ǰ�������λ����[ps+index-is+1, pe]
	        // ��������Ӧ�����������λ����[index+1, ie]
	        node.right = construct(preorder, ps + index - is + 1, pe, inorder, index + 1, ie);

	        // ���ش����ĸ����
	        return node;
	    }
	 
	//�������������
	  public static void printTree(TreeNode root) {
	      if (root != null) {
	          printTree(root.left);
	          System.out.print(root.val + " ");
	          printTree(root.right);
	      }

	  }

	  // ��ͨ������
	  //              1
	  //           /     \
	  //          2       3
	  //         /       / \
	  //        4       5   6
	  //         \         /
	  //          7       8
	  private static void test1() {
	      int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
	      int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
	      TreeNode root = reConstructBinaryTree(preorder, inorder);
	      printTree(root);
	  }

	  // ���н�㶼û�����ӽ��
	  //            1
	  //           /
	  //          2
	  //         /
	  //        3
	  //       /
	  //      4
	  //     /
	  //    5
	  private static void test2() {
	      int[] preorder = {1, 2, 3, 4, 5};
	      int[] inorder = {5, 4, 3, 2, 1};
	      TreeNode root = reConstructBinaryTree(preorder, inorder);
	      printTree(root);
	  }

	  // ���н�㶼û�����ӽ��
	  //            1
	  //             \
	  //              2
	  //               \
	  //                3
	  //                 \
	  //                  4
	  //                   \
	  //                    5
	  private static void test3() {
	      int[] preorder = {1, 2, 3, 4, 5};
	      int[] inorder = {1, 2, 3, 4, 5};
	      TreeNode root = reConstructBinaryTree(preorder, inorder);
	      printTree(root);
	  }

	  // ����ֻ��һ�����
	  private static void test4() {
	      int[] preorder = {1};
	      int[] inorder = {1};
	      TreeNode root = reConstructBinaryTree(preorder, inorder);
	      printTree(root);
	  }

	  // ��ȫ������
	  //              1
	  //           /     \
	  //          2       3
	  //         / \     / \
	  //        4   5   6   7
	  private static void test5() {
	      int[] preorder = {1, 2, 4, 5, 3, 6, 7};
	      int[] inorder = {4, 2, 5, 1, 6, 3, 7};
	      TreeNode root = reConstructBinaryTree(preorder, inorder);
	      printTree(root);
	  }
	  public static void main(String[] args) {

	      test1();
	      System.out.println();
	      test2();
	      System.out.println();
	      test3();
	      System.out.println();
	      test4();
	      System.out.println();
	      test5();
	      System.out.println();

	  }
}

  //���������
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  

  
  
 