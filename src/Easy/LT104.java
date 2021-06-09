//Given the root of a binary tree, return its maximum depth.
package Easy;

import static java.lang.Integer.max;

public class LT104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int count = 0;
        return maxCount(root,count);
    }

    public int maxCount(TreeNode root, int count){
        if( root == null)
            return count;
        count++;
        return max(maxCount(root.left,count),maxCount(root.right,count));
    }

    public static void main(String[] args) {
        LT104 obj1 = new LT104();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(2);
        n1.right = n2;
        n1.left = n3;
        n3.left = n4;
        n4.right = n5;
        System.out.println(obj1.maxDepth(n1));
    }
}
