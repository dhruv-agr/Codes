package Graphs;

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

class BinTreeNode{
    int val;
    BinTreeNode left;
    BinTreeNode right;
    BinTreeNode(int val){
        this.val = val;
    }
    BinTreeNode(){

    }

    public BinTreeNode constructMinBST(int nodes[],int start,int end){

        int mid = (start + end)/2;
        // System.out.println("start is: " + start + " end is: " + end+" mid is: " +mid);
        if(start == end  ){
            // System.out.println("Inside the if");
            return new BinTreeNode(nodes[mid]);
        }

        BinTreeNode currNode = new BinTreeNode(nodes[mid]);
        if(start!=mid){
            currNode.left = constructMinBST(nodes, start, mid-1);

        }
        currNode.right = constructMinBST(nodes,mid+1, end);
        return currNode;
    }

    public void printInorder(BinTreeNode node){
        if(node.left !=null){
            printInorder(node.left);
        }
        System.out.println(node.val);
        if(node.right !=null){
            printInorder(node.right);
        }
    }
}