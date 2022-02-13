package Adobe.TreesGraphs;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> response = new ArrayList<>();
        helper(root,response);
        return response;
    }

    public void helper(TreeNode root, List<Integer> response){
        if(root != null){
            if( root.left != null)
                helper(root.left,response);
            response.add(root.val);
            if(root.right != null)
                helper(root.right, response);
        }
    }


    public static void main(String[] args) {

        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode root = new TreeNode(2,left,right);


    }



}
