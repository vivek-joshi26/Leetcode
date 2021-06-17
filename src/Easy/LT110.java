//Given a binary tree, determine if it is height-balanced.

package Easy;

public class LT110 {

    public boolean isBalanced(TreeNode root) {
        if(root == null)
           return true;
        //int countLeft  = 0;
        //int countRight = 0;
        int difference = Math.abs(findHeight(root.left,0) - findHeight(root.right,0));
        if(difference > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int findHeight(TreeNode root, int count){
        if(root == null)
            return count;
        count++;
        return Math.max(findHeight(root.left,count),findHeight(root.right,count));

    }

    public static void main(String[] args) {
        LT110 obj1 = new LT110();

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

        System.out.println(obj1.isBalanced(n1));
    }
}
