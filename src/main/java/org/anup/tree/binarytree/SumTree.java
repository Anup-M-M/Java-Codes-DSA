package main.java.org.anup.tree.binarytree;

public class SumTree {

    static int f = 1;

    static int helper(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val;
        if(f==0) return 0;
        int a = helper(root.left);

        int b = helper(root.right);
        if( a + b != root.val) f = 0;
        int sum = a + b + root.val;
        return sum;
    }

    static boolean isSumTree(TreeNode root) {
        f = 1;
        helper(root);
        if(f == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(60);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(10);

        boolean isSumTree = isSumTree(root);
        System.out.println(isSumTree);
    }
}
