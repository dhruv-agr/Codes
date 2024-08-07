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

