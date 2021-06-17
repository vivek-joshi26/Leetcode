//Given a binary tree, find its minimum depth.
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
package Easy;

public class LT111 {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return findMinDepth(root);
    }

    public int findMinDepth(TreeNode root){
        if(root == null)
            return Integer.MAX_VALUE;
        if(root.left == null && root.right == null)
            return 1;

        return (Math.min(findMinDepth(root.left),findMinDepth(root.right)) + 1);
    }

    public static void main(String[] args) {
        LT111 obj1 = new LT111();

        /*
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        n4.left = n7;
        //n6.right = n8;

         */

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n4.left = n5;

        System.out.println(obj1.minDepth(n1));
    }
}
