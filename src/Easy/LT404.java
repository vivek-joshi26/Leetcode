//Sum of Left Leaves
package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class LT404 {
    // Using DFS, and global count variable
    public int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return -1;

        sumUtil(root);
        return count;
    }

    public void sumUtil(TreeNode treeNode){
        if(treeNode.left != null && (treeNode.left.left == null && treeNode.left.right == null))
            count += treeNode.left.val;
        if(treeNode.left != null)
            sumUtil(treeNode.left);
        if(treeNode.right != null)
            sumUtil(treeNode.right);
    }


    // Using BFS
    public int sumOfLeftLeaves2(TreeNode root) {
        if(root == null)
            return -1;
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNodeTemp = queue.poll();
            if(treeNodeTemp.left != null && treeNodeTemp.left.left == null && treeNodeTemp.left.right == null)
                count += treeNodeTemp.left.val;
            if(treeNodeTemp.left != null)
                queue.add(treeNodeTemp.left);
            if (treeNodeTemp.right != null)
                queue.add(treeNodeTemp.right);
        }
        return count;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.right.left = new TreeNode(3);
        TreeNode.print(node);

        LT404 obj = new LT404();
        System.out.println(obj.sumOfLeftLeaves2(node));

    }
}
