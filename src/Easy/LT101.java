//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class LT101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
       return checkSymmetricRecursive(root.left,root.right);
    }

    //Recursive Approach- everytime check the left sub tree of 1st node with right subtree of 2nd node and vice versa
    public boolean checkSymmetricRecursive(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null)
            return true;
        if(node1 == null || node2 == null)
            return false;
        return (node1.val == node2.val) && checkSymmetricRecursive(node1.left,node2.right) && checkSymmetricRecursive(node1.right,node2.left);

    }

    //Iterative approach
    public boolean isSymmetric2(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (queue.isEmpty() != true){
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if( node1 == null && node2 == null)
                continue;
            if(node1 == null || node2 == null)
                return false;
            if(node1.val != node2.val)
                return false;
            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }


    public static void main(String[] args) {
        LT101 obj1 = new LT101();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        n1.right = n2;
        n1.left = n3;
        System.out.println(obj1.isSymmetric(n1));
        System.out.print(obj1.isSymmetric2(n1));
    }
}
