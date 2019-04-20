package BinaryTree;

import java.util.Stack;

/**
 * @program: offer
 * @description: Operates the given binary tree and transforms it into a mirror of the source binary tree.
 * @author: Mr.Q
 * @create: 2019-04-19 19:17
 **/
public class MirrorTree {
//    public void Mirror(TreeNode root){
//        if (root == null)
//            return;
//        Stack<TreeNode> stack = new Stack<>();
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                TreeNode temp = root.left;
//                root.left = root.right;
//                root.right = temp;
//                stack.push(root);
//                root = root.left;
//            }
//            if (!stack.isEmpty()) {
//                root = stack.pop();
//                root = root.right;
//            }
//        }
//    }

    public void Mirror(TreeNode root){
        if (root != null){
            TreeNode swap = root.left;
            root.left = root.right;
            root.right = swap;
            if (root.left != null)
                Mirror(root.left);
            if (root.right != null)
                Mirror(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        MirrorTree mirrorTree = new MirrorTree();
        mirrorTree.Mirror(root);
        System.out.println(root);


    }
}
