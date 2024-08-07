package Trees;
import Trees.BinaryTreeNode;
public class CheckIfBST {
    public static void main(String args[]){
        BinaryTreeNode root = new BinaryTreeNode(5);
        root.left = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(8);
        root.right.right = new BinaryTreeNode(7);
        boolean result = perform(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("result is " + result);
    }
    public static boolean perform(BinaryTreeNode node, int min, int max){
        int minval = min;
        int maxval = max;
        System.out.println("min val: " +minval + " max val: " + maxval + " node value: " + node.val);
        if(node.val <=maxval && node.val >minval){
            if(node.left !=null){
                boolean res = perform(node.left,minval,node.val);
                if(!res){
                    System.out.println("false caught");
                    return false;
                }
            }
            if(node.right !=null){
                boolean res = perform(node.right, node.val, maxval);
                if(!res){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
}

