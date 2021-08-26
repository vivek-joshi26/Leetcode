//Given the root of a binary tree, return the preorder traversal of its nodes' values.
//
package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LT144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return preorderTraversalUtil(root,list);
    }

    public List<Integer> preorderTraversalUtil(TreeNode root, List<Integer> list) {

        if(root == null)
            return list;
        list.add(root.val);
        if(root.left != null)
           preorderTraversalUtil(root.left,list);
        if(root.right != null)
            preorderTraversalUtil(root.right,list);

        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return null;
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.left != null)
                stack.push(temp.left);
            if(temp.right != null)
                stack.push(temp.right);

        }
        return list;
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return postorderTraversalUtil(root,list);
    }

    public List<Integer> postorderTraversalUtil(TreeNode root, List<Integer> list) {

        if(root == null)
            return list;
        if(root.left != null)
            postorderTraversalUtil(root.left,list);
        if(root.right != null)
            postorderTraversalUtil(root.right,list);
        list.add(root.val);
        return list;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.add(root);
        while (!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            stack2.push(temp.val);
           if( temp.left != null)
               stack1.push(temp.left);
            if( temp.right != null)
                stack1.push(temp.right);
        }

        while (!stack2.isEmpty())
            list.add(stack2.pop());

        return list;
    }


    public static void main(String[] args) {

        LT144 lt144 = new LT144();
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        TreeNode head2 = new TreeNode();
        System.out.println(lt144.preorderTraversal2(head));
        System.out.println(lt144.postorderTraversal2(head));

    }
}
