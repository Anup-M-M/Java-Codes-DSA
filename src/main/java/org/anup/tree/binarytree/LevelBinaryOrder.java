package main.java.org.anup.tree.binarytree;

import java.util.*;

//leetcode #102. Binary Tree Level Order Traversal
public class LevelBinaryOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<List<Integer>> levels = levelOrder(root);
        System.out.println(levels);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return res;

        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                arr.add(queue.poll().val);
            }
            res.add(arr);
        }
        return res;
    }
}
