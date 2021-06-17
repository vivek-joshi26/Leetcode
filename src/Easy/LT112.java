//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
package Easy;

public class LT112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkPathSum(root,targetSum,0);
    }

    public boolean checkPathSum(TreeNode root, int targetSum, int checkSum){
        if(root == null)
            return false;
        checkSum = checkSum + root.val;
        if (root.left == null && root.right == null)
            return checkSum == targetSum;
        return checkPathSum(root.left,targetSum,checkSum) || checkPathSum(root.right,targetSum,checkSum);
    }

    // Other approach can be
    public static boolean hasPathSum2(TreeNode root, int targetSum) {

        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null && targetSum-root.val==0)
        {
            return true;
        }
        return hasPathSum2(root.left, targetSum-root.val) || hasPathSum2(root.right, targetSum-root.val);
    }



    public static void main(String[] args) {
        LT112 obj = new LT112();

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
        System.out.println(obj.hasPathSum(n1,8));
    }
}
