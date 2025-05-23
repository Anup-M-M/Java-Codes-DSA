package main.java.org.anup.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LeftSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> res = leftSideView(root);
        System.out.println(res);
    }

    public static List<Integer> leftSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        preOrder(root, 1, res);

        return res;
    }

    public static void preOrder(TreeNode root, int level, List<Integer> res){

        if(root == null) return;

        if(res.size() < level)
            res.add(root.val);

        preOrder(root.left, level+1, res);

        preOrder(root.right, level+1, res);

    }
}
