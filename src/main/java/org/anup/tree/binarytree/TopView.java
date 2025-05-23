package main.java.org.anup.tree.binarytree;

import java.util.*;

public class TopView {

    static class Pair{
        int level;
        TreeNode node;
        Pair(int level, TreeNode node){
            this.level= level;
            this.node = node;
        }
    }

    static ArrayList<Integer> topView(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();

        if(root == null)
            return res;

        Map<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(0, root));

        while(!queue.isEmpty()){
            Pair cp = queue.remove();
            int lev = cp.level;
            TreeNode n = cp.node;
            if(map.get(lev) == null)
                map.put(lev, n.val);
            if(n.left != null)
                queue.add(new Pair(lev-1, n.left));
            if(n.right != null)
                queue.add(new Pair(lev+1, n.right));
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);

        ArrayList<Integer> res = topView(root);
        System.out.println(res);

    }
}
