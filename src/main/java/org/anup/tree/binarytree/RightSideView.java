package main.java.org.anup.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

//leetCode #199. Binary Tree Right Side View
public class RightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<Integer> res = rightSideView(root);
        System.out.println(res);
    }

    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        preOrder(root, 1, res);

        return res;
    }

    public static void preOrder(TreeNode root, int level, List<Integer> res){

        if(root == null) return;

        if(res.size() < level)
            res.add(root.val);

        preOrder(root.right, level+1, res);

        preOrder(root.left, level+1, res);

    }
}
