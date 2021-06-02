package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LT94 {


    // ************** SOLVING Using RECURSIVE Approach *******************************************
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        helperInorder(root,result);
        return result;
    }

    public void helperInorder(TreeNode root, List<Integer> result){

        if(root != null){

            if(root.left != null){
                helperInorder(root.left,result);
            }
            result.add(root.val);
            if(root.right != null){
                helperInorder(root.right,result);
            }
        }

    }

    //************************************************************************************************


    //*******************SOLVING without recursion, Iterative approach with the help of data structure***********************
    public List<Integer> inorderTraversal2(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || stack.isEmpty() != true){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }



        return result;
    }


    public static void main(String[] args) {
        LT94 obj1 = new LT94();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.right = n2;
        n2.left = n3;

        List<Integer> answer = new ArrayList<>();
        answer = obj1.inorderTraversal(n1);

        for (int n :answer
             ) {
            System.out.print(n+" ");
        }


    }
}
