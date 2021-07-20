package Easy;

import java.util.*;
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

public Map<Integer, ArrayList<Integer>> levelOrder(TreeNode treeNode){
        if(treeNode == null)
            return null;
        int level = 1;
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        return levelOrderUtil(map,treeNode,level);
}

public Map<Integer, ArrayList<Integer>> levelOrderUtil(Map<Integer,ArrayList<Integer>> map,TreeNode treeNode, int level){
       ArrayList<Integer> list = map.getOrDefault(level,new ArrayList<>());
       list.add(treeNode.val);
       map.put(level,list);
       if (treeNode.left != null)
           levelOrderUtil(map,treeNode.left,level+1);
       if(treeNode.right != null)
           levelOrderUtil(map,treeNode.right,level+1);
       return map;
}

public Map<Integer,Integer> getSumMultiply(Map<Integer,ArrayList<Integer>> map,String operation){
        Map<Integer,Integer> resultMap = new HashMap<>();

        if(operation == "sum"){

            for (int i:map.keySet()
                 ) {
                int count = 0;
                ArrayList<Integer> arrayList = map.get(i);
                for (int j: arrayList
                     ) {
                    count += j;
                }
                resultMap.put(i,count);
            }
        }
        else if(operation == "multiply"){

            for (int i:map.keySet()
            ) {
                int count = 1;
                ArrayList<Integer> arrayList = map.get(i);
                for (int j: arrayList
                ) {
                    count = count * j;
                }
                resultMap.put(i,count);
            }
        }
        return resultMap;
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

        Map<Integer,ArrayList<Integer>> map = node.levelOrder(node);
        System.out.println(map);

        Map<Integer,Integer> resultMap = node.getSumMultiply(map,"multiply");
        System.out.println(resultMap);
    }


}

