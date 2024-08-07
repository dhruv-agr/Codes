package Trees;

import java.util.ArrayList;

class BinTreeNode {
    int val;
    BinTreeNode left;
    BinTreeNode right;

    ArrayList<ArrayList<Integer>> levelLists = new ArrayList<ArrayList<Integer>>();


    BinTreeNode(int val) {
        this.val = val;
    }

    BinTreeNode() {

    }

    public ArrayList<ArrayList<Integer>> makeLists(BinTreeNode node, int level) {
        if (level <= levelLists.size() - 1) {
            levelLists.get(level).add(node.val);
        } else {
            ArrayList<Integer> sameLevelList = new ArrayList<Integer>();
            sameLevelList.add(node.val);
            levelLists.add(sameLevelList);

        }

        if (node.left != null) {
            makeLists(node.left, level + 1);
        }
        if (node.right != null) {
            makeLists(node.right, level + 1);
        }
        return levelLists;
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
