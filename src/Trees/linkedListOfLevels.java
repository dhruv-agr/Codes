package Trees;
import java.util.*;
public class linkedListOfLevels {


    public static void main(String args[]){
        BinTreeNode root = new BinTreeNode(1);
        root.left = new BinTreeNode(2);
        root.right = new BinTreeNode(3);
        root.left.left = new BinTreeNode(4);
        root.left.right = new BinTreeNode(5);
        root.left.left.left = new BinTreeNode(8);
        root.left.left.left.left = new BinTreeNode(9);
        root.right.left = new BinTreeNode(6);
        root.right.right = new BinTreeNode(7);

        ArrayList<ArrayList<Integer>> lists = root.makeLists(root,0);
        System.out.println(lists);
    }
}

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
    public ArrayList<ArrayList<Integer>> makeLists(BinTreeNode node,int level){
        if(level <= levelLists.size()-1){
            levelLists.get(level).add(node.val);
        }
        else{
            ArrayList<Integer> sameLevelList = new ArrayList<Integer>();
            sameLevelList.add(node.val);
            levelLists.add(sameLevelList);

        }

        if(node.left !=null){
            makeLists(node.left, level +1);
        }
        if(node.right !=null){
            makeLists(node.right, level + 1);
        }
        return levelLists;
    }
}