//108. Convert Sorted Array to Binary Search Tree
package Easy;

public class LT108 {

    public TreeNode sortedArrayToBST(int[] array){
        return construct(array,0,array.length-1);
    }

    public TreeNode construct(int[] array, int l , int r){
        if (l > r)
            return null;
        int mid = (l+r)/2;
        //int mid = l+((r-l)/2);
        int value = array[mid];
        TreeNode node = new TreeNode(value);
        node.left = construct(array,l,mid-1);
        node.right = construct(array,mid+1,r);
        return node;
    }


    public static void main(String[] args) {
        int array[] = {-3,1,5,7,9};

        LT108 obj = new LT108();
        TreeNode node = obj.sortedArrayToBST(array);
        TreeNode.print(node);

    }
}
