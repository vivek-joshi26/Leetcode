package Adobe.TreesGraphs;

import com.sun.source.tree.Tree;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
            if(root == null)
                return true;
            return inOrder(root);
    }

    //Approach1 using Inorder Traversal
    Integer prev = null;
    private boolean inOrder(TreeNode root){
        if(root == null)
            return true;
        if(inOrder(root.left) != true)
            return false;
        if(prev != null && prev >= root.val)
            return false;
        prev = root.val;
        return inOrder(root.right);
    }

    // Approach 2 using, low and high ranges
    public boolean isValidBST2(TreeNode root) {
        if(root == null)
            return true;
        return check(root, null, null);
    }

    public boolean check(TreeNode root, Integer low, Integer high){
        if(root == null)
            return true;
        if((low != null && root.val <= low) || (high != null && root.val >= high))
            return false;
        return check(root.left,low,root.val) && check(root.right, root.val, high);
    }


    public static void main(String[] args) {
        ValidateBST validateBST = new ValidateBST();
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode root = new TreeNode(2,left,right);


        System.out.print(validateBST.isValidBST2(root));
    }


}
