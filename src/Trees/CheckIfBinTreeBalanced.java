package Trees;

public class CheckIfBinTreeBalanced {
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        root.right.right.right.right = new TreeNode(8);
        CheckBalanced obj = new CheckBalanced();
        System.out.println(obj.checkifbalanced(root));

    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}

class CheckBalanced{

    boolean checkifbalanced(TreeNode node){
        int leftsubheight = getheight(node.left);
        int rightsubheight = getheight(node.right);
        System.out.println("left height: " + leftsubheight + " right height: " + rightsubheight);
        if(leftsubheight ==-1 || rightsubheight ==-1){

            return false;
        }
        if(Math.abs(leftsubheight- rightsubheight)>1){
            return false;
        }
        else{
            return true;
        }
    }
    int getheight(TreeNode node){
        int leftheight;
        int rightheight;
        if(node.left == null && node.right == null){
            return 1;
        }

        if(node.left !=null){
             leftheight = getheight(node.left);
             if(leftheight == -1){
                 return -1;
             }

        }
        else{
            leftheight=0;
        }

        if(node.right !=null){
            rightheight = getheight(node.right);
            if(rightheight == -1){
                return -1;
            }
        }
        else{
            rightheight=0;
        }
        System.out.println("leftheight: " + leftheight + " rightheight: " + rightheight);
        if(Math.abs(leftheight-rightheight) >1){
            return -1;
        }
        return Math.max(leftheight,rightheight) + 1;

    }
}
