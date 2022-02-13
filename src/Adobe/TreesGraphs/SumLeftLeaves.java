package Adobe.TreesGraphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class SumLeftLeaves {

    // Approach 1
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        return getSum(root,false);

    }

    private int getSum(TreeNode root, boolean leftnode){
        if(root.left == null && root.right == null){
            if (leftnode == true)
                 return root.val;
            else return 0;
        }
        int total = 0;
        if(root.left != null)
            total += getSum(root.left, true);
        if (root.right != null)
            total += getSum(root.right, false);

        return total;

    }


    // Approach 2
    public int sumOfLeftLeaves2(TreeNode root) {
        if(root == null)
            return 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int total = 0;

        while (stack.isEmpty() != true){
            TreeNode temp = stack.pop();
            if(checkLeftLeave(temp.left)){
                total += temp.left.val;
            }
            if(temp.left != null)
                stack.push(temp.left);
            if(temp.right != null)
                stack.push(temp.right);
        }
        return total;

    }

    public boolean checkLeftLeave(TreeNode node){
        if(node != null && node.left == null && node.right == null)
            return true;
        return false;
    }



    public static void main(String[] args) {

        SumLeftLeaves sumLeftLeaves = new SumLeftLeaves();
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode root = new TreeNode(2,left,right);
        System.out.print(sumLeftLeaves.sumOfLeftLeaves2(root));
    }


}
