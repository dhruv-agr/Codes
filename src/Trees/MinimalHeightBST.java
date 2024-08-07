package Trees;

public class MinimalHeightBST {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int nodes[]  ={1,2,3,4,5,6};
        int mid = (0 + nodes.length)/2;
        BinTreeNode obj = new BinTreeNode();
        obj = obj.constructMinBST(nodes,0,nodes.length - 1);
        // obj.val = 3;
        // obj.left = new BinTreeNode(2);
        // obj.right = new BinTreeNode(4);
        // obj.left.left = new BinTreeNode(1);
        obj.printInorder(obj);
    }
}

