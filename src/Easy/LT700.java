//Search in a Binary Search Tree
package Easy;

public class LT700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if ( val < root.val)
            return searchBST(root.left,val);
        else if( val > root.val)
            return searchBST(root.right,val);
        return null;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        TreeNode.print(node);

        LT700 obj = new LT700();
        System.out.println(obj.searchBST(node,18));

    }
}
