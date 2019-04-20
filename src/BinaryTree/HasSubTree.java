package BinaryTree;

import sun.reflect.generics.tree.Tree;

/**
 * @program: offer
 * @description: Enter two binary trees A, B to determine if B is a substructure of A.
 * (ps: We agree that an empty tree is not a substructure of any tree)
 * @author: Mr.Q
 * @create: 2019-04-19 10:21
 **/
public class HasSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        //当Tree1和Tree2都不为零的时候，才进行比较。否则直接返回false
        if (root1 != null && root2 != null){
            //如果找到了对应Tree2的根节点的点
            if (root1.val == root2.val){
                result = tree1HasTree2(root1,root2);
            }if (!result){//如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
                result = tree1HasTree2(root1.left,root2);
            }if (!result){//如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
                result = tree1HasTree2(root1.right,root2);
            }
        }
        return result;
    }

    private static boolean tree1HasTree2(TreeNode node1, TreeNode node2){
        //如果Tree2已经遍历完了都能对应的上，返回true
        if (node2 == null)
            return true;
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        if (node1 == null)
            return false;
        //如果其中有一个点没有对应上，返回false
        if (node1.val != node2.val)
            return false;
        //如果根节点对应的上，那么分别去子节点里面匹配
        return tree1HasTree2(node1.left,node2.left) &&
                tree1HasTree2(node1.right,node2.right);
    }
}
