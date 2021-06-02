package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LT100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {

        if( p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (queue.isEmpty() != true){
            TreeNode first = queue.remove();
            TreeNode second = queue.remove();
            if(first == null && second == null)
                continue;
            if(first == null || second == null)
                return false;
            if( first.val != second.val)
                return false;
            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);
        }
        return true;
    }



        public static void main(String[] args) {
        LT100 obj1 = new LT100();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.right = n2;
        n2.left = n3;
        boolean b = obj1.isSameTree(n1,n1);
        System.out.println(b);
    }
}
