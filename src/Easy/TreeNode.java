package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}

      TreeNode(int val) { this.val = val; }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
}
public static void print(TreeNode node){
        if(node == null)
            System.out.print(" null ");
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()){
        TreeNode temp = queue.poll();
        System.out.print(temp.val+" ");

        if(temp.left != null)
            queue.add(temp.left);
        if(temp.right != null)
            queue.add(temp.right);
    }

}
}

